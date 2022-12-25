package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.chipChipPropsMod.ChipPropsColorOverrides
import com.olvind.mui.muiJoy.chipChipPropsMod.ChipPropsVariantOverrides
import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.ColorPaletteProp
import com.olvind.mui.muiJoy.stylesTypesVariantsMod.VariantProp
import com.olvind.mui.muiTypes.mod.OverridableStringUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<ChipProps<'div', {}>, 'color' | 'disabled' | 'variant'> */
trait PickChipPropsdivcolordisabledvariant extends StObject {
  
  var color: js.UndefOr[OverridableStringUnion[ColorPaletteProp, ChipPropsColorOverrides]] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var variant: js.UndefOr[OverridableStringUnion[VariantProp, ChipPropsVariantOverrides]] = js.undefined
}
object PickChipPropsdivcolordisabledvariant {
  
  inline def apply(): PickChipPropsdivcolordisabledvariant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickChipPropsdivcolordisabledvariant]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickChipPropsdivcolordisabledvariant] (val x: Self) extends AnyVal {
    
    inline def setColor(value: OverridableStringUnion[ColorPaletteProp, ChipPropsColorOverrides]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setVariant(value: OverridableStringUnion[VariantProp, ChipPropsVariantOverrides]): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
