package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.radioRadioPropsMod.RadioPropsColorOverrides
import com.olvind.mui.muiJoy.radioRadioPropsMod.RadioPropsSizeOverrides
import com.olvind.mui.muiJoy.radioRadioPropsMod.RadioPropsVariantOverrides
import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.ColorPaletteProp
import com.olvind.mui.muiJoy.stylesTypesThemeMod.SxProps
import com.olvind.mui.muiJoy.stylesTypesVariantsMod.VariantProp
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import com.olvind.mui.muiTypes.mod.OverridableStringUnion
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.ElementType
import org.scalajs.dom.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultValue extends StObject {
  
  /**
    * Class name applied to the root element.
    */
  var className: js.UndefOr[String] = js.undefined
  
  /**
    * The color of the component. It supports those theme colors that make sense for this component.
    * @default 'neutral'
    */
  var color: js.UndefOr[OverridableStringUnion[ColorPaletteProp, RadioPropsColorOverrides]] = js.undefined
  
  /**
    * The component used for the Root slot.
    * Either a string to use a HTML element or a component.
    */
  var component: js.UndefOr[ElementType] = js.undefined
  
  /**
    * The default value. Use when the component is not controlled.
    */
  var defaultValue: js.UndefOr[Any] = js.undefined
  
  /**
    * The radio's `disabledIcon` prop. If specified, the value is passed down to every radios under this element.
    * @default false
    */
  var disableIcon: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name used to reference the value of the control.
    * If you don't provide this prop, it falls back to a randomly generated name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Callback fired when a radio button is selected.
    *
    * @param {React.ChangeEvent<HTMLInputElement>} event The event source of the callback.
    * You can pull out the new value by accessing `event.target.value` (string).
    */
  var onChange: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLInputElement], Unit]] = js.undefined
  
  /**
    * The component orientation.
    * @default 'vertical'
    */
  var orientation: js.UndefOr["horizontal" | "vertical"] = js.undefined
  
  /**
    * The radio's `overlay` prop. If specified, the value is passed down to every radios under this element.
    * @default false
    */
  var overlay: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The size of the component.
    * @default 'md'
    */
  var size: js.UndefOr[OverridableStringUnion["sm" | "md" | "lg", RadioPropsSizeOverrides]] = js.undefined
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps] = js.undefined
  
  /**
    * Value of the selected radio button. The DOM API casts this to a string.
    */
  var value: js.UndefOr[Any] = js.undefined
  
  /**
    * The [global variant](https://mui.com/joy-ui/main-features/global-variants/) to use.
    * @default 'plain'
    */
  var variant: js.UndefOr[OverridableStringUnion[VariantProp, RadioPropsVariantOverrides]] = js.undefined
}
object DefaultValue {
  
  inline def apply(): DefaultValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultValue] (val x: Self) extends AnyVal {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setColor(value: OverridableStringUnion[ColorPaletteProp, RadioPropsColorOverrides]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setComponent(value: ElementType): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setDefaultValue(value: Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDisableIcon(value: Boolean): Self = StObject.set(x, "disableIcon", value.asInstanceOf[js.Any])
    
    inline def setDisableIconUndefined: Self = StObject.set(x, "disableIcon", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnChange(value: /* event */ ReactEventFrom[HTMLInputElement] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* event */ ReactEventFrom[HTMLInputElement]) => value(t0).runNow()))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOrientation(value: "horizontal" | "vertical"): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setOverlay(value: Boolean): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    
    inline def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
    
    inline def setSize(value: OverridableStringUnion["sm" | "md" | "lg", RadioPropsSizeOverrides]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
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
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setVariant(value: OverridableStringUnion[VariantProp, RadioPropsVariantOverrides]): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
