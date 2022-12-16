package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import com.olvind.mui.std.NonNullable
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FullWidth extends StObject {
  
  /**
    * The content of the component.
    */
  var children: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.undefined
  
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[PartialToggleButtonClasses] = js.undefined
  
  /**
    * The color of the button when it is in an active state.
    * It supports both default and custom theme colors, which can be added as shown in the
    * [palette customization guide](https://mui.com/material-ui/customization/palette/#adding-new-colors).
    * @default 'standard'
    */
  var color: js.UndefOr["standard" | "primary" | "secondary" | "error" | "info" | "success" | "warning"] = js.undefined
  
  /**
    * If `true`, the  keyboard focus ripple is disabled.
    * @default false
    */
  var disableFocusRipple: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the component is disabled.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the button will take up the full width of its container.
    * @default false
    */
  var fullWidth: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Callback fired when the state changes.
    *
    * @param {React.MouseEvent<HTMLElement>} event The event source of the callback.
    * @param {any} value of the selected button.
    */
  var onChange: js.UndefOr[
    js.Function2[/* event */ ReactMouseEventFrom[HTMLElement], /* value */ Any, Unit]
  ] = js.undefined
  
  /**
    * Callback fired when the button is clicked.
    *
    * @param {React.MouseEvent<HTMLElement>} event The event source of the callback.
    * @param {any} value of the selected button.
    */
  var onClick: js.UndefOr[
    js.Function2[/* event */ ReactMouseEventFrom[HTMLElement], /* value */ Any, Unit]
  ] = js.undefined
  
  /**
    * If `true`, the button is rendered in an active state.
    */
  var selected: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The size of the component.
    * The prop defaults to the value inherited from the parent ToggleButtonGroup component.
    * @default 'medium'
    */
  var size: js.UndefOr["small" | "medium" | "large"] = js.undefined
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps[com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme]] = js.undefined
  
  /**
    * The value to associate with the button when selected in a
    * ToggleButtonGroup.
    */
  var value: NonNullable[Any]
}
object FullWidth {
  
  inline def apply(value: NonNullable[Any]): FullWidth = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullWidth]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FullWidth] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setClasses(value: PartialToggleButtonClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setColor(value: "standard" | "primary" | "secondary" | "error" | "info" | "success" | "warning"): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDisableFocusRipple(value: Boolean): Self = StObject.set(x, "disableFocusRipple", value.asInstanceOf[js.Any])
    
    inline def setDisableFocusRippleUndefined: Self = StObject.set(x, "disableFocusRipple", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
    
    inline def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
    
    inline def setOnChange(value: (/* event */ ReactMouseEventFrom[HTMLElement], /* value */ Any) => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLElement], t1: /* value */ Any) => (value(t0, t1)).runNow()))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnClick(value: (/* event */ ReactMouseEventFrom[HTMLElement], /* value */ Any) => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLElement], t1: /* value */ Any) => (value(t0, t1)).runNow()))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setSize(value: "small" | "medium" | "large"): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSx(value: SxProps[com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme]): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
    
    inline def setSxFunction1(
      value: com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme => SystemStyleObject[com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme]
    ): Self = StObject.set(x, "sx", js.Any.fromFunction1(value))
    
    inline def setSxNull: Self = StObject.set(x, "sx", null)
    
    inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
    
    inline def setSxVarargs(
      value: (Boolean | SystemStyleObject[com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme] | (js.Function1[
          com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme, 
          SystemStyleObject[com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme]
        ]))*
    ): Self = StObject.set(x, "sx", js.Array(value*))
    
    inline def setValue(value: NonNullable[Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
