package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.autocompleteAutocompletePropsMod.AutocompletePropsColorOverrides
import com.olvind.mui.muiJoy.autocompleteAutocompletePropsMod.AutocompletePropsSizeOverrides
import com.olvind.mui.muiJoy.autocompleteAutocompletePropsMod.AutocompletePropsVariantOverrides
import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.ColorPaletteProp
import com.olvind.mui.muiJoy.stylesTypesVariantsMod.VariantProp
import com.olvind.mui.muiTypes.mod.OverridableStringUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Size extends StObject {
  
  var color: js.UndefOr[OverridableStringUnion[ColorPaletteProp, AutocompletePropsColorOverrides]] = js.undefined
  
  var size: js.UndefOr[OverridableStringUnion["sm" | "md" | "lg", AutocompletePropsSizeOverrides]] = js.undefined
  
  var variant: js.UndefOr[OverridableStringUnion[VariantProp, AutocompletePropsVariantOverrides]] = js.undefined
}
object Size {
  
  inline def apply(): Size = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Size]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Size] (val x: Self) extends AnyVal {
    
    inline def setColor(value: OverridableStringUnion[ColorPaletteProp, AutocompletePropsColorOverrides]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setSize(value: OverridableStringUnion["sm" | "md" | "lg", AutocompletePropsSizeOverrides]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setVariant(value: OverridableStringUnion[VariantProp, AutocompletePropsVariantOverrides]): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
