package webMotors.interacoes

import webMotors.interfaces.*
import webMotors.interfacesJavascript.ActionsClickJavascript
import webMotors.interfacesJavascript.ActionsMoveJavascript
import webMotors.interfacesJavascript.ActionsWriteJavascript

class ActionsWeb : ActionsAlert, ActionsBrowser, ActionsClear, ActionsClick,
    ActionsFrame, ActionsGet,
    ActionsMove, ActionsSelect, ActionsValidation, ActionsWait, ActionsWrite, ActionsClickJavascript,
    ActionsMoveJavascript, ActionsWriteJavascript