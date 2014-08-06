/**
 *  Turn On Light When Door Opens
 *
 *  Copyright 2014 Matt Nohr
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License. You may obtain a copy of the License at:
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
 *  for the specific language governing permissions and limitations under the License.
 *
 */
definition(
    name: "Turn On Light When Door Opens",
    namespace: "mrnohr",
    author: "Matt Nohr",
    description: "Turn on a light when a door opens",
    category: "My Apps",
    iconUrl: "https://s3.amazonaws.com/smartapp-icons/Convenience/Cat-Convenience.png",
    iconX2Url: "https://s3.amazonaws.com/smartapp-icons/Convenience/Cat-Convenience@2x.png")


preferences {
    section("When the door opens..."){
        input "contact1", "capability.contactSensor", title: "Where?"
    }
    section("Turn on a light..."){
        input "switches", "capability.switch", multiple: true
    }
    section("Turn it off after this many minutes"){
        input "offMinutes", "number", required: false
    }
}

def installed() {
    log.debug "Installed with settings: ${settings}"

    initialize()
}

def updated() {
    log.debug "Updated with settings: ${settings}"

    unsubscribe()
    unschedule()
    initialize()
}

def initialize() {
    // TODO: subscribe to attributes, devices, locations, etc.
    subscribe(contact1, "contact.open", contactOpenHandler)
}

// TODO: implement event handlers
def contactOpenHandler(evt) {
    log.debug "$evt.value: $evt, $settings"
    log.info "Turning on switches: $switches"
    switches.on()

    if(offMinutes) {
        runIn(offMinutes * 60, "scheduledTurnOff")
    }
}

def scheduledTurnOff() {
    log.info "Turning off switches after $offMinutes: $switches"
    switches.off()
}
