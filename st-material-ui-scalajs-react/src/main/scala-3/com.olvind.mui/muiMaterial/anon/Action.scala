package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.buttonBaseButtonBaseMod.ButtonBaseActions
import com.olvind.mui.muiMaterial.buttonBaseTouchRippleMod.TouchRippleActions
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import com.olvind.mui.react.mod.FocusEventHandler
import com.olvind.mui.std.NonNullable
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action extends StObject {
  
  /**
    * The component used to render a link when the `href` prop is provided.
    * @default 'a'
    */
  var LinkComponent: js.UndefOr[ElementType] = js.undefined
  
  /**
    * Props applied to the `TouchRipple` element.
    */
  var TouchRippleProps: js.UndefOr[PartialTouchRippleProps] = js.undefined
  
  /**
    * A ref for imperative actions.
    * It currently only supports `focusVisible()` action.
    */
  var action: js.UndefOr[com.olvind.mui.react.mod.Ref[ButtonBaseActions]] = js.undefined
  
  /**
    * If `true`, the ripples are centered.
    * They won't start at the cursor interaction position.
    * @default false
    */
  var centerRipple: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The content of the component.
    */
  var children: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.undefined
  
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[PartialButtonBaseClasses] = js.undefined
  
  /**
    * If `true`, the ripple effect is disabled.
    *
    * ⚠️ Without a ripple there is no styling for :focus-visible by default. Be sure
    * to highlight the element by applying separate styles with the `.Mui-focusVisible` class.
    * @default false
    */
  var disableRipple: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the touch ripple effect is disabled.
    * @default false
    */
  var disableTouchRipple: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the component is disabled.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the base button will have a keyboard focus ripple.
    * @default false
    */
  var focusRipple: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This prop can help identify which element has keyboard focus.
    * The class name will be applied when the element gains the focus through keyboard interaction.
    * It's a polyfill for the [CSS :focus-visible selector](https://drafts.csswg.org/selectors-4/#the-focus-visible-pseudo).
    * The rationale for using this feature [is explained here](https://github.com/WICG/focus-visible/blob/HEAD/explainer.md).
    * A [polyfill can be used](https://github.com/WICG/focus-visible) to apply a `focus-visible` class to other components
    * if needed.
    */
  var focusVisibleClassName: js.UndefOr[String] = js.undefined
  
  /**
    * Callback fired when the component is focused with a keyboard.
    * We trigger a `onFocus` callback too.
    */
  var onFocusVisible: js.UndefOr[FocusEventHandler[Any]] = js.undefined
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps[com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme]] = js.undefined
  
  /**
    * @default 0
    */
  var tabIndex: js.UndefOr[NonNullable[js.UndefOr[Double]]] = js.undefined
  
  /**
    * A ref that points to the `TouchRipple` element.
    */
  var touchRippleRef: js.UndefOr[com.olvind.mui.react.mod.Ref[TouchRippleActions]] = js.undefined
}
object Action {
  
  inline def apply(): Action = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Action]
  }
  
  extension [Self <: Action](x: Self) {
    
    inline def setAction(value: com.olvind.mui.react.mod.Ref[ButtonBaseActions]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionFunction1(value: ButtonBaseActions | Null => Callback): Self = StObject.set(x, "action", js.Any.fromFunction1((t0: ButtonBaseActions | Null) => value(t0).runNow()))
    
    inline def setActionNull: Self = StObject.set(x, "action", null)
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setCenterRipple(value: Boolean): Self = StObject.set(x, "centerRipple", value.asInstanceOf[js.Any])
    
    inline def setCenterRippleUndefined: Self = StObject.set(x, "centerRipple", js.undefined)
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setClasses(value: PartialButtonBaseClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setDisableRipple(value: Boolean): Self = StObject.set(x, "disableRipple", value.asInstanceOf[js.Any])
    
    inline def setDisableRippleUndefined: Self = StObject.set(x, "disableRipple", js.undefined)
    
    inline def setDisableTouchRipple(value: Boolean): Self = StObject.set(x, "disableTouchRipple", value.asInstanceOf[js.Any])
    
    inline def setDisableTouchRippleUndefined: Self = StObject.set(x, "disableTouchRipple", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setFocusRipple(value: Boolean): Self = StObject.set(x, "focusRipple", value.asInstanceOf[js.Any])
    
    inline def setFocusRippleUndefined: Self = StObject.set(x, "focusRipple", js.undefined)
    
    inline def setFocusVisibleClassName(value: String): Self = StObject.set(x, "focusVisibleClassName", value.asInstanceOf[js.Any])
    
    inline def setFocusVisibleClassNameUndefined: Self = StObject.set(x, "focusVisibleClassName", js.undefined)
    
    inline def setLinkComponent(value: ElementType): Self = StObject.set(x, "LinkComponent", value.asInstanceOf[js.Any])
    
    inline def setLinkComponentUndefined: Self = StObject.set(x, "LinkComponent", js.undefined)
    
    inline def setOnFocusVisible(value: ReactFocusEventFrom[Any & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onFocusVisible", js.Any.fromFunction1((t0: ReactFocusEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnFocusVisibleUndefined: Self = StObject.set(x, "onFocusVisible", js.undefined)
    
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
    
    inline def setTabIndex(value: NonNullable[js.UndefOr[Double]]): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    inline def setTouchRippleProps(value: PartialTouchRippleProps): Self = StObject.set(x, "TouchRippleProps", value.asInstanceOf[js.Any])
    
    inline def setTouchRipplePropsUndefined: Self = StObject.set(x, "TouchRippleProps", js.undefined)
    
    inline def setTouchRippleRef(value: com.olvind.mui.react.mod.Ref[TouchRippleActions]): Self = StObject.set(x, "touchRippleRef", value.asInstanceOf[js.Any])
    
    inline def setTouchRippleRefFunction1(value: TouchRippleActions | Null => Callback): Self = StObject.set(x, "touchRippleRef", js.Any.fromFunction1((t0: TouchRippleActions | Null) => value(t0).runNow()))
    
    inline def setTouchRippleRefNull: Self = StObject.set(x, "touchRippleRef", null)
    
    inline def setTouchRippleRefUndefined: Self = StObject.set(x, "touchRippleRef", js.undefined)
  }
}
