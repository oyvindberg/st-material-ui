package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.buttonUnstyledPropsMod.ButtonUnstyledActions
import com.olvind.mui.muiBase.muiBaseStrings.button
import com.olvind.mui.muiBase.muiBaseStrings.reset
import com.olvind.mui.muiBase.muiBaseStrings.submit
import com.olvind.mui.react.mod.FocusEventHandler
import com.olvind.mui.react.mod.MouseEventHandler
import com.olvind.mui.std.NonNullable
import org.scalajs.dom.Element
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @mui/base.@mui/base/ButtonUnstyled/ButtonUnstyledProps.ButtonUnstyledOwnProps & Omit<any, keyof ButtonUnstyledOwnProps> & {  component :react.react.ElementType<any> | undefined} */
trait ButtonUnstyledOwnPropsOmitanykeyofButton extends StObject {
  
  /**
    * A ref for imperative actions. It currently only supports `focusVisible()` action.
    */
  var action: js.UndefOr[com.olvind.mui.react.mod.Ref[ButtonUnstyledActions]] = js.undefined
  
  var children: js.UndefOr[ReactElement] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var component: js.UndefOr[ReactElement] = js.undefined
  
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
    
    inline def setActionFunction1(value: /* instance */ ButtonUnstyledActions | Null => Unit): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
    
    inline def setActionNull: Self = StObject.set(x, "action", null)
    
    inline def setActionReactRef(value: ReactRef[ButtonUnstyledActions]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setComponent(value: ReactElement): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setComponents(value: Root): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsProps(value: `1`): Self = StObject.set(x, "componentsProps", value.asInstanceOf[js.Any])
    
    inline def setComponentsPropsUndefined: Self = StObject.set(x, "componentsProps", js.undefined)
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    inline def setOnClick(value: SyntheticMouseEvent[Element] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnFocusVisible(value: SyntheticFocusEvent[Element] => Unit): Self = StObject.set(x, "onFocusVisible", js.Any.fromFunction1(value))
    
    inline def setOnFocusVisibleUndefined: Self = StObject.set(x, "onFocusVisible", js.undefined)
    
    inline def setTabIndex(value: NonNullable[js.UndefOr[Double]]): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    inline def setType(value: submit | reset | button): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
