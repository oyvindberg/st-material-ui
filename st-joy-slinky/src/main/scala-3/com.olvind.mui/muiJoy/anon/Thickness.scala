package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.linearProgressLinearProgressPropsMod.LinearProgressPropsColorOverrides
import com.olvind.mui.muiJoy.linearProgressLinearProgressPropsMod.LinearProgressPropsSizeOverrides
import com.olvind.mui.muiJoy.linearProgressLinearProgressPropsMod.LinearProgressPropsVariantOverrides
import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.ColorPaletteProp
import com.olvind.mui.muiJoy.stylesTypesThemeMod.SxProps
import com.olvind.mui.muiJoy.stylesTypesVariantsMod.VariantProp
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import com.olvind.mui.muiTypes.mod.OverridableStringUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Thickness extends StObject {
  
  /**
    * The color of the component. It supports those theme colors that make sense for this component.
    * @default 'primary'
    */
  var color: js.UndefOr[OverridableStringUnion[ColorPaletteProp, LinearProgressPropsColorOverrides]] = js.undefined
  
  /**
    * The boolean to select a variant.
    * Use indeterminate when there is no progress value.
    * @default false
    */
  var determinate: js.UndefOr[true | false] = js.undefined
  
  /**
    * The size of the component.
    * It accepts theme values between 'sm' and 'lg'.
    * @default 'md'
    */
  var size: js.UndefOr[OverridableStringUnion["sm" | "md" | "lg", LinearProgressPropsSizeOverrides]] = js.undefined
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps] = js.undefined
  
  /**
    * The thickness of the bar.
    */
  var thickness: js.UndefOr[Double] = js.undefined
  
  /**
    * The value of the progress indicator for the determinate variant.
    * Value between 0 and 100.
    *
    * For indeterminate, @default 25
    */
  var value: js.UndefOr[Double] = js.undefined
  
  /**
    * The variant to use.
    * @default 'soft'
    */
  var variant: js.UndefOr[OverridableStringUnion[VariantProp, LinearProgressPropsVariantOverrides]] = js.undefined
}
object Thickness {
  
  inline def apply(): Thickness = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Thickness]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Thickness] (val x: Self) extends AnyVal {
    
    inline def setColor(value: OverridableStringUnion[ColorPaletteProp, LinearProgressPropsColorOverrides]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDeterminate(value: true | false): Self = StObject.set(x, "determinate", value.asInstanceOf[js.Any])
    
    inline def setDeterminateUndefined: Self = StObject.set(x, "determinate", js.undefined)
    
    inline def setSize(value: OverridableStringUnion["sm" | "md" | "lg", LinearProgressPropsSizeOverrides]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
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
    
    inline def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
    
    inline def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setVariant(value: OverridableStringUnion[VariantProp, LinearProgressPropsVariantOverrides]): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
