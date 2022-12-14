package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.autocompleteListboxAutocompleteListboxPropsMod.AutocompleteListboxPropsColorOverrides
import com.olvind.mui.muiJoy.autocompleteListboxAutocompleteListboxPropsMod.AutocompleteListboxPropsSizeOverrides
import com.olvind.mui.muiJoy.autocompleteListboxAutocompleteListboxPropsMod.AutocompleteListboxPropsVariantOverrides
import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.ColorPaletteProp
import com.olvind.mui.muiJoy.stylesTypesThemeMod.SxProps
import com.olvind.mui.muiJoy.stylesTypesVariantsMod.VariantProp
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import com.olvind.mui.muiTypes.mod.OverridableStringUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sx extends StObject {
  
  /**
    * The color of the component. It supports those theme colors that make sense for this component.
    * @default 'neutral'
    */
  var color: js.UndefOr[OverridableStringUnion[ColorPaletteProp, AutocompleteListboxPropsColorOverrides]] = js.undefined
  
  /**
    * The size of the component (affect other nested list* components).
    * @default 'md'
    */
  var size: js.UndefOr[
    OverridableStringUnion["sm" | "md" | "lg", AutocompleteListboxPropsSizeOverrides]
  ] = js.undefined
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps] = js.undefined
  
  /**
    * The [global variant](https://mui.com/joy-ui/main-features/global-variants/) to use.
    * @default 'outlined'
    */
  var variant: js.UndefOr[OverridableStringUnion[VariantProp, AutocompleteListboxPropsVariantOverrides]] = js.undefined
}
object Sx {
  
  inline def apply(): Sx = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sx]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Sx] (val x: Self) extends AnyVal {
    
    inline def setColor(value: OverridableStringUnion[ColorPaletteProp, AutocompleteListboxPropsColorOverrides]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setSize(value: OverridableStringUnion["sm" | "md" | "lg", AutocompleteListboxPropsSizeOverrides]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSx(value: SxProps): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
    
    inline def setSxFunction1(
      value: com.olvind.mui.muiJoy.stylesTypesThemeMod.Theme => SystemStyleObject[com.olvind.mui.muiJoy.stylesTypesThemeMod.Theme]
    ): Self = StObject.set(x, "sx", js.Any.fromFunction1(value))
    
    inline def setSxNull: Self = StObject.set(x, "sx", null)
    
    inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
    
    inline def setSxVarargs(
      value: (Boolean | SystemStyleObject[com.olvind.mui.muiJoy.stylesTypesThemeMod.Theme] | (js.Function1[
          com.olvind.mui.muiJoy.stylesTypesThemeMod.Theme, 
          SystemStyleObject[com.olvind.mui.muiJoy.stylesTypesThemeMod.Theme]
        ]))*
    ): Self = StObject.set(x, "sx", js.Array(value*))
    
    inline def setVariant(value: OverridableStringUnion[VariantProp, AutocompleteListboxPropsVariantOverrides]): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
