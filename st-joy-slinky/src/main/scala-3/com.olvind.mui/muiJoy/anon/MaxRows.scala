package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.ColorPaletteProp
import com.olvind.mui.muiJoy.stylesTypesThemeMod.SxProps
import com.olvind.mui.muiJoy.stylesTypesVariantsMod.VariantProp
import com.olvind.mui.muiJoy.textareaTextareaPropsMod.TextareaPropsColorOverrides
import com.olvind.mui.muiJoy.textareaTextareaPropsMod.TextareaPropsSizeOverrides
import com.olvind.mui.muiJoy.textareaTextareaPropsMod.TextareaPropsVariantOverrides
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import com.olvind.mui.muiTypes.mod.OverridableStringUnion
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxRows extends StObject {
  
  /**
    * The color of the component. It supports those theme colors that make sense for this component.
    * @default 'neutral'
    */
  var color: js.UndefOr[OverridableStringUnion[ColorPaletteProp, TextareaPropsColorOverrides]] = js.undefined
  
  /**
    * Trailing adornment for this input.
    */
  var endDecorator: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * If `true`, the `input` will indicate an error.
    * The prop defaults to the value (`false`) inherited from the parent FormControl component.
    */
  var error: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Maximum number of rows to display.
    */
  var maxRows: js.UndefOr[String | Double] = js.undefined
  
  /**
    * Minimum number of rows to display.
    * @default 1
    */
  var minRows: js.UndefOr[String | Double] = js.undefined
  
  /**
    * The size of the component.
    * @default 'md'
    */
  var size: js.UndefOr[OverridableStringUnion["sm" | "md" | "lg", TextareaPropsSizeOverrides]] = js.undefined
  
  /**
    * Leading adornment for this input.
    */
  var startDecorator: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps] = js.undefined
  
  /**
    * The variant to use.
    * @default 'outlined'
    */
  var variant: js.UndefOr[OverridableStringUnion[VariantProp, TextareaPropsVariantOverrides]] = js.undefined
}
object MaxRows {
  
  inline def apply(): MaxRows = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxRows]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaxRows] (val x: Self) extends AnyVal {
    
    inline def setColor(value: OverridableStringUnion[ColorPaletteProp, TextareaPropsColorOverrides]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setEndDecorator(value: ReactElement): Self = StObject.set(x, "endDecorator", value.asInstanceOf[js.Any])
    
    inline def setEndDecoratorUndefined: Self = StObject.set(x, "endDecorator", js.undefined)
    
    inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setMaxRows(value: String | Double): Self = StObject.set(x, "maxRows", value.asInstanceOf[js.Any])
    
    inline def setMaxRowsUndefined: Self = StObject.set(x, "maxRows", js.undefined)
    
    inline def setMinRows(value: String | Double): Self = StObject.set(x, "minRows", value.asInstanceOf[js.Any])
    
    inline def setMinRowsUndefined: Self = StObject.set(x, "minRows", js.undefined)
    
    inline def setSize(value: OverridableStringUnion["sm" | "md" | "lg", TextareaPropsSizeOverrides]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStartDecorator(value: ReactElement): Self = StObject.set(x, "startDecorator", value.asInstanceOf[js.Any])
    
    inline def setStartDecoratorUndefined: Self = StObject.set(x, "startDecorator", js.undefined)
    
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
    
    inline def setVariant(value: OverridableStringUnion[VariantProp, TextareaPropsVariantOverrides]): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
