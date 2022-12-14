package com.olvind.mui.muiBase

import com.olvind.mui.muiBase.anon.Root
import com.olvind.mui.react.mod.FocusEventHandler
import com.olvind.mui.react.mod.Ref
import com.olvind.mui.std.NonNullable
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
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

object buttonUnstyledButtonUnstyledDottypesMod {
  
  trait ButtonUnstyledActions extends StObject {
    
    def focusVisible(): Unit
  }
  object ButtonUnstyledActions {
    
    inline def apply(focusVisible: Callback): ButtonUnstyledActions = {
      val __obj = js.Dynamic.literal(focusVisible = focusVisible.toJsFn)
      __obj.asInstanceOf[ButtonUnstyledActions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ButtonUnstyledActions] (val x: Self) extends AnyVal {
      
      inline def setFocusVisible(value: Callback): Self = StObject.set(x, "focusVisible", value.toJsFn)
    }
  }
  
  /* Inlined parent std.Omit<@mui/base.@mui/base/useButton.UseButtonParameters, 'ref'> */
  trait ButtonUnstyledOwnProps extends StObject {
    
    /**
      * A ref for imperative actions. It currently only supports `focusVisible()` action.
      */
    var action: js.UndefOr[Ref[ButtonUnstyledActions]] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var focusableWhenDisabled: js.UndefOr[Boolean] = js.undefined
    
    var href: js.UndefOr[String] = js.undefined
    
    var onFocusVisible: js.UndefOr[FocusEventHandler[Element]] = js.undefined
    
    /**
      * The props used for each slot inside the Button.
      * @default {}
      */
    var slotProps: js.UndefOr[Root] = js.undefined
    
    /**
      * The components used for each slot inside the Button.
      * Either a string to use a HTML element or a component.
      * @default {}
      */
    var slots: js.UndefOr[ButtonUnstyledSlots] = js.undefined
    
    var tabIndex: js.UndefOr[NonNullable[js.UndefOr[Double]]] = js.undefined
    
    var to: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr["submit" | "reset" | "button"] = js.undefined
  }
  object ButtonUnstyledOwnProps {
    
    inline def apply(): ButtonUnstyledOwnProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonUnstyledOwnProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ButtonUnstyledOwnProps] (val x: Self) extends AnyVal {
      
      inline def setAction(value: Ref[ButtonUnstyledActions]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
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
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFocusableWhenDisabled(value: Boolean): Self = StObject.set(x, "focusableWhenDisabled", value.asInstanceOf[js.Any])
      
      inline def setFocusableWhenDisabledUndefined: Self = StObject.set(x, "focusableWhenDisabled", js.undefined)
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setOnFocusVisible(value: ReactFocusEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onFocusVisible", js.Any.fromFunction1((t0: ReactFocusEventFrom[Element & Element]) => value(t0).runNow()))
      
      inline def setOnFocusVisibleUndefined: Self = StObject.set(x, "onFocusVisible", js.undefined)
      
      inline def setSlotProps(value: Root): Self = StObject.set(x, "slotProps", value.asInstanceOf[js.Any])
      
      inline def setSlotPropsUndefined: Self = StObject.set(x, "slotProps", js.undefined)
      
      inline def setSlots(value: ButtonUnstyledSlots): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
      
      inline def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
      
      inline def setTabIndex(value: NonNullable[js.UndefOr[Double]]): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setType(value: "submit" | "reset" | "button"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ButtonUnstyledOwnerState
    extends StObject
       with ButtonUnstyledOwnProps {
    
    var active: Boolean
    
    var focusVisible: Boolean
  }
  object ButtonUnstyledOwnerState {
    
    inline def apply(active: Boolean, focusVisible: Boolean): ButtonUnstyledOwnerState = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], focusVisible = focusVisible.asInstanceOf[js.Any])
      __obj.asInstanceOf[ButtonUnstyledOwnerState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ButtonUnstyledOwnerState] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setFocusVisible(value: Boolean): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
    }
  }
  
  trait ButtonUnstyledRootSlotPropsOverrides extends StObject
  
  trait ButtonUnstyledSlots extends StObject {
    
    /**
      * The component that renders the root.
      * @default props.href || props.to ? 'a' : 'button'
      */
    var root: js.UndefOr[ElementType] = js.undefined
  }
  object ButtonUnstyledSlots {
    
    inline def apply(): ButtonUnstyledSlots = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonUnstyledSlots]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ButtonUnstyledSlots] (val x: Self) extends AnyVal {
      
      inline def setRoot(value: ElementType): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
