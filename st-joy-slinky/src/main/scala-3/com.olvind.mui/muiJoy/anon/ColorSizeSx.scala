package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.ColorPaletteProp
import com.olvind.mui.muiJoy.stylesTypesThemeMod.SxProps
import com.olvind.mui.muiJoy.stylesTypesVariantsMod.VariantProp
import com.olvind.mui.muiJoy.tabsTabsPropsMod.TabsPropsColorOverrides
import com.olvind.mui.muiJoy.tabsTabsPropsMod.TabsPropsSizeOverrides
import com.olvind.mui.muiJoy.tabsTabsPropsMod.TabsPropsVariantOverrides
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import com.olvind.mui.muiTypes.mod.OverridableStringUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorSizeSx extends StObject {
  
  /**
    * The color of the component. It supports those theme colors that make sense for this component.
    * @default 'neutral'
    */
  var color: js.UndefOr[OverridableStringUnion[ColorPaletteProp, TabsPropsColorOverrides]] = js.undefined
  
  /**
    * The size of the component.
    */
  var size: js.UndefOr[OverridableStringUnion["sm" | "md" | "lg", TabsPropsSizeOverrides]] = js.undefined
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps] = js.undefined
  
  /**
    * The variant to use.
    * @default 'plain'
    */
  var variant: js.UndefOr[OverridableStringUnion[VariantProp, TabsPropsVariantOverrides]] = js.undefined
}
object ColorSizeSx {
  
  inline def apply(): ColorSizeSx = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorSizeSx]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColorSizeSx] (val x: Self) extends AnyVal {
    
    inline def setColor(value: OverridableStringUnion[ColorPaletteProp, TabsPropsColorOverrides]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setSize(value: OverridableStringUnion["sm" | "md" | "lg", TabsPropsSizeOverrides]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
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
    
    inline def setVariant(value: OverridableStringUnion[VariantProp, TabsPropsVariantOverrides]): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}