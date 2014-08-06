# This script is used to build the git repository so the comaparisons are clean and easy to use
# This does what git tells you never to do... rewrite history

# Rebuild repo
rm -rf .git
git init
git remote add origin git@github.com:mrnohr/smartapp-workshop.git

# Add README and LICENSE
git add README.md
git add LICENSE
git commit -m "Add README and LICENSE"

# Add this script file
git add scripts/buildHistory.sh
git commit -m "Add the script to create the clean git history"

# Add all steps
git add steps/*.groovy
git commit -m "Add all individual steps"

# Remove old file
rm turn-on-when-opens.groovy

# Copy all the steps and create branches
cp steps/01-blank-new-app.groovy turn-on-when-opens.groovy
git add turn-on-when-opens.groovy
git commit -m "01 blank"
git branch step1
cp steps/02-first-basic-app.groovy turn-on-when-opens.groovy
git commit -am "02 basic"
git branch step2
cp steps/03-multiple-switches.groovy turn-on-when-opens.groovy
git commit -am "03 multiple switches"
git branch step3
cp steps/04-turn-off-schedule.groovy turn-on-when-opens.groovy
git commit -am "04 create a schedule"
git branch step4
cp steps/05-leave-on-if-still-open.groovy turn-on-when-opens.groovy
git commit -am "05 leave on if open"
git branch step5
cp steps/06-leave-on-latest-value.groovy turn-on-when-opens.groovy
git commit -am "06 get latest value of a device"
git branch step6
cp steps/07-send-notification.groovy turn-on-when-opens.groovy
git commit -am "07 send notifications"
git branch step7
cp steps/08-events-since.groovy turn-on-when-opens.groovy
git commit -am "08 lookup events in the past X minutes"
git branch step8
cp steps/09-pages.groovy turn-on-when-opens.groovy
git commit -am "09 paged preferences"
git branch step9
cp steps/10-time-range.groovy turn-on-when-opens.groovy
git commit -am "10 time range"
git branch step10
cp steps/11-execute-phrase.groovy turn-on-when-opens.groovy
git commit -am "11 execute phrase"
git branch step11

# Push it all up
git push -u origin --all --force
