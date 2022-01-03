package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.buttonUnstyledPropsMod.ButtonUnstyledActions
import com.olvind.mui.muiBase.muiBaseStrings.button
import com.olvind.mui.muiBase.muiBaseStrings.reset
import com.olvind.mui.muiBase.muiBaseStrings.submit
import com.olvind.mui.react.mod.FocusEventHandler
import com.olvind.mui.react.mod.MouseEventHandler
import com.olvind.mui.std.NonNullable
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @mui/base.@mui/base/ButtonUnstyled/ButtonUnstyledProps.ButtonUnstyledOwnProps & Omit<any, keyof ButtonUnstyledOwnProps> & {  component :react.react.ElementType<any> | undefined} */
trait ButtonUnstyledOwnPropsOmitanykeyofButton extends StObject {
  
  /**
    * A ref for imperative actions. It currently only supports `focusVisible()` action.
    */
  var action: js.UndefOr[com.olvind.mui.react.mod.Ref[ButtonUnstyledActions]] = js.undefined
  
  var children: js.UndefOr[Node] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var component: js.UndefOr[ElementType] = js.undefined
  
  var components: js.UndefOr[Root] = js.undefined
  
  var componentsProps: js.UndefOr[`1`] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var href: js.UndefOr[String] = js.undefined
  
  var onClick: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  
  var onFocusVisible: js.UndefOr[FocusEventHandler[Element]] = js.undefined
  
  var tabIndex: js.UndefOr[NonNullable[js.UndefOr[Double]]] = js.undefined
  
  var to: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[submit | reset | button] = js.undefined
}
object ButtonUnstyledOwnPropsOmitanykeyofButton {
  
  inline def apply(): ButtonUnstyledOwnPropsOmitanykeyofButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonUnstyledOwnPropsOmitanykeyofButton]
  }
  
  extension [Self <: ButtonUnstyledOwnPropsOmitanykeyofButton](x: Self) {
    
    inline def setAction(value: com.olvind.mui.react.mod.Ref[ButtonUnstyledActions]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionFunction1(value: ButtonUnstyledActions | Null => Callback): Self = StObject.set(x, "action", js.Any.fromFunction1((t0: ButtonUnstyledActions | Null) => value(t0).runNow()))
    
    inline def setActionNull: Self = StObject.set(x, "action", null)
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setComponent(value: ElementType): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setComponents(value: Root): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsProps(value: `1`): Self = StObject.set(x, "componentsProps", value.asInstanceOf[js.Any])
    
    inline def setComponentsPropsUndefined: Self = StObject.set(x, "componentsProps", js.undefined)
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    inline def setOnClick(value: ReactMouseEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[Element & Element]) => value(t0).runNow()))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnFocusVisible(value: ReactFocusEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onFocusVisible", js.Any.fromFunction1((t0: ReactFocusEventFrom[Element & Element]) => value(t0).runNow()))
    
    inline def setOnFocusVisibleUndefined: Self = StObject.set(x, "onFocusVisible", js.undefined)
    
    inline def setTabIndex(value: NonNullable[js.UndefOr[Double]]): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    inline def setType(value: submit | reset | button): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
