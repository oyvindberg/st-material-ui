package com.olvind.mui.muiBase.anon

import com.olvind.mui.react.mod.Dispatch
import com.olvind.mui.react.mod.SetStateAction
import com.olvind.mui.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FocusVisible extends StObject {
  
  var active: Boolean = js.native
  
  var disabled: Boolean = js.native
  
  var focusVisible: Boolean = js.native
  
  def getRootProps(): Ariacontrols = js.native
  def getRootProps(otherHandlers: Record[String, js.Function1[/* event */ Any, Unit]]): Ariacontrols = js.native
  
  var selected: Boolean = js.native
  
  var setFocusVisible: Dispatch[SetStateAction[Boolean]] = js.native
}
