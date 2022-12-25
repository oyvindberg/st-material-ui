package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.cardCardPropsMod.CardPropsColorOverrides
import com.olvind.mui.muiJoy.cardCardPropsMod.CardPropsSizeOverrides
import com.olvind.mui.muiJoy.cardCardPropsMod.CardPropsVariantOverrides
import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.ColorPaletteProp
import com.olvind.mui.muiJoy.stylesTypesThemeMod.SxProps
import com.olvind.mui.muiJoy.stylesTypesVariantsMod.VariantProp
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import com.olvind.mui.muiTypes.mod.OverridableStringUnion
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Row extends StObject {
  
  /**
    * Used to render icon or text elements inside the Card if `src` is not set.
    * This can be an element, or just a string.
    */
  var children: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * The color of the component. It supports those theme colors that make sense for this component.
    * @default 'neutral'
    */
  var color: js.UndefOr[OverridableStringUnion[ColorPaletteProp, CardPropsColorOverrides]] = js.undefined
  
  /**
    * If `true`, flex direction is set to 'row'.
    * @default false
    */
  var row: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The size of the component.
    * It accepts theme values between 'sm' and 'lg'.
    * @default 'md'
    */
  var size: js.UndefOr[OverridableStringUnion["sm" | "md" | "lg", CardPropsSizeOverrides]] = js.undefined
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps] = js.undefined
  
  /**
    * The variant to use.
    * @default 'plain'
    */
  var variant: js.UndefOr[OverridableStringUnion[VariantProp, CardPropsVariantOverrides]] = js.undefined
}
object Row {
  
  inline def apply(): Row = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Row]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Row] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setColor(value: OverridableStringUnion[ColorPaletteProp, CardPropsColorOverrides]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setRow(value: Boolean): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    
    inline def setSize(value: OverridableStringUnion["sm" | "md" | "lg", CardPropsSizeOverrides]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
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
    
    inline def setVariant(value: OverridableStringUnion[VariantProp, CardPropsVariantOverrides]): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
