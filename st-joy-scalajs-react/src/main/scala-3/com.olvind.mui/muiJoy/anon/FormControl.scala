package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiBase.inputUnstyledUseInputDottypesMod.UseInputInputSlotProps
import com.olvind.mui.muiBase.inputUnstyledUseInputDottypesMod.UseInputRootSlotProps
import com.olvind.mui.muiJoy.formControlFormControlContextMod.FormControlContextValue
import com.olvind.mui.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormControl extends StObject {
  
  var disabled: Boolean = js.native
  
  var error: Boolean = js.native
  
  var focused: Boolean = js.native
  
  var formControl: FormControlContextValue = js.native
  
  var formControlContext: js.UndefOr[Filled] = js.native
  
  def getInputProps[TOther /* <: Record[String, Any] */](): UseInputInputSlotProps[TOther] = js.native
  def getInputProps[TOther /* <: Record[String, Any] */](externalProps: TOther): UseInputInputSlotProps[TOther] = js.native
  
  def getRootProps[TOther_1 /* <: Record[String, Any] */](): UseInputRootSlotProps[TOther_1] = js.native
  def getRootProps[TOther_1 /* <: Record[String, Any] */](externalProps: TOther_1): UseInputRootSlotProps[TOther_1] = js.native
  
  var inputStateClasses: Record[String, Any] = js.native
  
  var propsToForward: Record[String, Any] = js.native
  
  var required: Boolean = js.native
  
  var rootStateClasses: Record[String, Any] = js.native
  
  var value: Any = js.native
}
