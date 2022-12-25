package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.formControlFormControlPropsMod.FormControlPropsColorOverrides
import com.olvind.mui.muiJoy.formControlFormControlPropsMod.FormControlPropsSizeOverrides
import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.ColorPaletteProp
import com.olvind.mui.muiTypes.mod.OverridableStringUnion
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined Pick<FormControlProps<FormControlTypeMap<{}, 'div'>['defaultComponent'], {}>, 'error' | 'disabled' | 'required' | 'color' | 'size'> & {  labelId :string,   htmlFor :string | undefined,   aria-describedby :string | undefined, setHelperText (node : null | std.HTMLElement): void, registerEffect (): (): void} */
@js.native
trait PickFormControlPropsFormControlTypeMapdi extends StObject {
  
  var `aria-describedby`: js.UndefOr[String] = js.native
  
  var color: js.UndefOr[OverridableStringUnion[ColorPaletteProp, FormControlPropsColorOverrides]] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var error: js.UndefOr[Boolean] = js.native
  
  var htmlFor: js.UndefOr[String] = js.native
  
  var labelId: String = js.native
  
  def registerEffect(): js.Function0[Unit] = js.native
  
  var required: js.UndefOr[Boolean] = js.native
  
  def setHelperText(): Unit = js.native
  def setHelperText(node: HTMLElement): Unit = js.native
  
  var size: js.UndefOr[OverridableStringUnion["sm" | "md" | "lg", FormControlPropsSizeOverrides]] = js.native
}
