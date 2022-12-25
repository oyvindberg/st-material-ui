package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.PickFormControlPropsFormControlTypeMapdi
import com.olvind.mui.react.mod.Context
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formControlFormControlContextMod extends Shortcut {
  
  @JSImport("@mui/joy/FormControl/FormControlContext", JSImport.Default)
  @js.native
  val default: Context[FormControlContextValue] = js.native
  
  type FormControlContextValue = js.UndefOr[PickFormControlPropsFormControlTypeMapdi]
  
  type _To = Context[FormControlContextValue]
  
  /* This means you don't have to write `default`, but can instead just say `formControlFormControlContextMod.foo` */
  override def _to: Context[FormControlContextValue] = default
}
