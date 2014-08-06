# SmartApp Workshop

Companion code used for the [SmartThings](http://www.smartthings.com) [SmartApp Workshops](http://blog.smartthings.com/news/roundups/smartapp-workshops/)

## Turn On A Light

The code here will create a SmartApp that turns on a light when a door opens. During the workshop we will start from an [empty SmartApp](https://github.com/mrnohr/smartapp-workshop/blob/master/steps/01-blank-new-app.groovy) and continue to add features to explain how to write SmartApps.

## Steps
1. Blank SmartApp
2. Make the basic app work [Git compare](https://github.com/mrnohr/smartapp-workshop/compare/step1...step2?w=1)
3. Support multiple switches [Git compare](https://github.com/mrnohr/smartapp-workshop/compare/step2...step3?w=1)
4. Turn off the light after X minutes [Git compare](https://github.com/mrnohr/smartapp-workshop/compare/step3...step4?w=1)
5. Leave it on if it is still open, using state [Git compare](https://github.com/mrnohr/smartapp-workshop/compare/step4...step5?w=1)
6. Leave it on, using latest value [Git compare](https://github.com/mrnohr/smartapp-workshop/compare/step4...step6?w=1) (from step 4)
7. Send notifications [Git compare](https://github.com/mrnohr/smartapp-workshop/compare/step6...step7?w=1)
8. Limit notifications by querying past events [Git compare](https://github.com/mrnohr/smartapp-workshop/compare/step7...step8?w=1)
9. Make the preferences use pages [Git compare](https://github.com/mrnohr/smartapp-workshop/compare/step8...step9?w=1)
10. Only execute during a given time range [Git compare](https://github.com/mrnohr/smartapp-workshop/compare/step9...step10?w=1)
11. Execute a Hello, Home phrase [Git compare](https://github.com/mrnohr/smartapp-workshop/compare/step10...step11?w=1)

## References

* [SmartThings SmartApp Documentation](http://docs.smartthings.com/en/latest/smartapp-developers-guide/index.html)
* [Additional SmartApp Documentation](https://graph.api.smartthings.com/ide/doc/smartApp)

## This Repository

Under the ```steps/``` directory, there is each step along the way in a separate file. The ```turn-on-when-opens.groovy``` file has each step applied to it in order. Then a branch was created at each step along the way for the comparisons.

Just as a warning, to keep the comparisons clean I do the one thing you aren't supposed to do with git... rewrite history.

Feel free to use these examples, but you have been warned if you clone this repository!
