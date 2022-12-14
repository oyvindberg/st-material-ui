package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.checkboxCheckboxPropsMod.CheckboxPropsColorOverrides
import com.olvind.mui.muiJoy.checkboxCheckboxPropsMod.CheckboxPropsSizeOverrides
import com.olvind.mui.muiJoy.checkboxCheckboxPropsMod.CheckboxPropsVariantOverrides
import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.ColorPaletteProp
import com.olvind.mui.muiJoy.stylesTypesThemeMod.SxProps
import com.olvind.mui.muiJoy.stylesTypesVariantsMod.VariantProp
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import com.olvind.mui.muiTypes.mod.OverridableStringUnion
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckedIcon extends StObject {
  
  /**
    * The icon to display when the component is checked.
    * @default <CheckIcon />
    */
  var checkedIcon: js.UndefOr[Node] = js.undefined
  
  /**
    * Class name applied to the root element.
    */
  var className: js.UndefOr[String] = js.undefined
  
  /**
    * The color of the component. It supports those theme colors that make sense for this component.
    * @default 'neutral'
    */
  var color: js.UndefOr[OverridableStringUnion[ColorPaletteProp, CheckboxPropsColorOverrides]] = js.undefined
  
  /**
    * If `true`, the checked icon is removed and the selected variant is applied on the `action` element instead.
    * @default false
    */
  var disableIcon: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the component appears indeterminate.
    * This does not set the native input element to indeterminate due
    * to inconsistent behavior across browsers.
    * However, we set a `data-indeterminate` attribute on the `input`.
    * @default false
    */
  var indeterminate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The icon to display when the component is indeterminate.
    * @default <IndeterminateIcon />
    */
  var indeterminateIcon: js.UndefOr[Node] = js.undefined
  
  /**
    * The label element next to the checkbox.
    */
  var label: js.UndefOr[Node] = js.undefined
  
  /**
    * The `name` attribute of the input.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * If `true`, the root element's position is set to initial which allows the action area to fill the nearest positioned parent.
    * This prop is useful for composing Checkbox with ListItem component.
    * @default false
    */
  var overlay: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The size of the component.
    * @default 'md'
    */
  var size: js.UndefOr[OverridableStringUnion["sm" | "md" | "lg", CheckboxPropsSizeOverrides]] = js.undefined
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps] = js.undefined
  
  /**
    * The icon when `checked` is false.
    */
  var uncheckedIcon: js.UndefOr[Node] = js.undefined
  
  /**
    * The value of the component. The DOM API casts this to a string.
    * The browser uses "on" as the default value.
    */
  var value: js.UndefOr[String | js.Array[String] | Double] = js.undefined
  
  /**
    * The [global variant](https://mui.com/joy-ui/main-features/global-variants/) to use.
    * @default 'solid'
    */
  var variant: js.UndefOr[OverridableStringUnion[VariantProp, CheckboxPropsVariantOverrides]] = js.undefined
}
object CheckedIcon {
  
  inline def apply(): CheckedIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckedIcon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CheckedIcon] (val x: Self) extends AnyVal {
    
    inline def setCheckedIcon(value: VdomNode): Self = StObject.set(x, "checkedIcon", value.rawNode.asInstanceOf[js.Any])
    
    inline def setCheckedIconNull: Self = StObject.set(x, "checkedIcon", null)
    
    inline def setCheckedIconUndefined: Self = StObject.set(x, "checkedIcon", js.undefined)
    
    inline def setCheckedIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "checkedIcon", js.Array(value*))
    
    inline def setCheckedIconVdomElement(value: VdomElement): Self = StObject.set(x, "checkedIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setColor(value: OverridableStringUnion[ColorPaletteProp, CheckboxPropsColorOverrides]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDisableIcon(value: Boolean): Self = StObject.set(x, "disableIcon", value.asInstanceOf[js.Any])
    
    inline def setDisableIconUndefined: Self = StObject.set(x, "disableIcon", js.undefined)
    
    inline def setIndeterminate(value: Boolean): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
    
    inline def setIndeterminateIcon(value: VdomNode): Self = StObject.set(x, "indeterminateIcon", value.rawNode.asInstanceOf[js.Any])
    
    inline def setIndeterminateIconNull: Self = StObject.set(x, "indeterminateIcon", null)
    
    inline def setIndeterminateIconUndefined: Self = StObject.set(x, "indeterminateIcon", js.undefined)
    
    inline def setIndeterminateIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "indeterminateIcon", js.Array(value*))
    
    inline def setIndeterminateIconVdomElement(value: VdomElement): Self = StObject.set(x, "indeterminateIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def setIndeterminateUndefined: Self = StObject.set(x, "indeterminate", js.undefined)
    
    inline def setLabel(value: VdomNode): Self = StObject.set(x, "label", value.rawNode.asInstanceOf[js.Any])
    
    inline def setLabelNull: Self = StObject.set(x, "label", null)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "label", js.Array(value*))
    
    inline def setLabelVdomElement(value: VdomElement): Self = StObject.set(x, "label", value.rawElement.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOverlay(value: Boolean): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    
    inline def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
    
    inline def setSize(value: OverridableStringUnion["sm" | "md" | "lg", CheckboxPropsSizeOverrides]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
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
    
    inline def setUncheckedIcon(value: VdomNode): Self = StObject.set(x, "uncheckedIcon", value.rawNode.asInstanceOf[js.Any])
    
    inline def setUncheckedIconNull: Self = StObject.set(x, "uncheckedIcon", null)
    
    inline def setUncheckedIconUndefined: Self = StObject.set(x, "uncheckedIcon", js.undefined)
    
    inline def setUncheckedIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "uncheckedIcon", js.Array(value*))
    
    inline def setUncheckedIconVdomElement(value: VdomElement): Self = StObject.set(x, "uncheckedIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def setValue(value: String | js.Array[String] | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
    
    inline def setVariant(value: OverridableStringUnion[VariantProp, CheckboxPropsVariantOverrides]): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
