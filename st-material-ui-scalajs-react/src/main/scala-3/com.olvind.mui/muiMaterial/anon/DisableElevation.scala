package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableElevation extends StObject {
  
  /**
    * The content of the component.
    */
  var children: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.undefined
  
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[PartialButtonClasses] = js.undefined
  
  /**
    * The color of the component.
    * It supports both default and custom theme colors, which can be added as shown in the
    * [palette customization guide](https://mui.com/material-ui/customization/palette/#adding-new-colors).
    * @default 'primary'
    */
  var color: js.UndefOr["inherit" | "primary" | "secondary" | "success" | "error" | "info" | "warning"] = js.undefined
  
  /**
    * If `true`, no elevation is used.
    * @default false
    */
  var disableElevation: js.UndefOr[Boolean] = js.undefined
  
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
    * Element placed after the children.
    */
  var endIcon: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.undefined
  
  /**
    * If `true`, the button will take up the full width of its container.
    * @default false
    */
  var fullWidth: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The URL to link to when the button is clicked.
    * If defined, an `a` element will be used as the root node.
    */
  var href: js.UndefOr[String] = js.undefined
  
  /**
    * The size of the component.
    * `small` is equivalent to the dense button styling.
    * @default 'medium'
    */
  var size: js.UndefOr["small" | "medium" | "large"] = js.undefined
  
  /**
    * Element placed before the children.
    */
  var startIcon: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.undefined
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps[com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme]] = js.undefined
  
  /**
    * The variant to use.
    * @default 'text'
    */
  var variant: js.UndefOr["text" | "outlined" | "contained"] = js.undefined
}
object DisableElevation {
  
  inline def apply(): DisableElevation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableElevation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisableElevation] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setClasses(value: PartialButtonClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setColor(value: "inherit" | "primary" | "secondary" | "success" | "error" | "info" | "warning"): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDisableElevation(value: Boolean): Self = StObject.set(x, "disableElevation", value.asInstanceOf[js.Any])
    
    inline def setDisableElevationUndefined: Self = StObject.set(x, "disableElevation", js.undefined)
    
    inline def setDisableFocusRipple(value: Boolean): Self = StObject.set(x, "disableFocusRipple", value.asInstanceOf[js.Any])
    
    inline def setDisableFocusRippleUndefined: Self = StObject.set(x, "disableFocusRipple", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setEndIcon(value: VdomNode): Self = StObject.set(x, "endIcon", value.rawNode.asInstanceOf[js.Any])
    
    inline def setEndIconNull: Self = StObject.set(x, "endIcon", null)
    
    inline def setEndIconUndefined: Self = StObject.set(x, "endIcon", js.undefined)
    
    inline def setEndIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "endIcon", js.Array(value*))
    
    inline def setEndIconVdomElement(value: VdomElement): Self = StObject.set(x, "endIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
    
    inline def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    inline def setSize(value: "small" | "medium" | "large"): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStartIcon(value: VdomNode): Self = StObject.set(x, "startIcon", value.rawNode.asInstanceOf[js.Any])
    
    inline def setStartIconNull: Self = StObject.set(x, "startIcon", null)
    
    inline def setStartIconUndefined: Self = StObject.set(x, "startIcon", js.undefined)
    
    inline def setStartIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "startIcon", js.Array(value*))
    
    inline def setStartIconVdomElement(value: VdomElement): Self = StObject.set(x, "startIcon", value.rawElement.asInstanceOf[js.Any])
    
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
    
    inline def setVariant(value: "text" | "outlined" | "contained"): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
