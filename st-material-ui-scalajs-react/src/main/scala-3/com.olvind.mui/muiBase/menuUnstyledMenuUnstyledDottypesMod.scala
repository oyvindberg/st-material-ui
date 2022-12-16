package com.olvind.mui.muiBase

import com.olvind.mui.muiBase.anon.ListboxRoot
import com.olvind.mui.muiBase.anon.`8`
import com.olvind.mui.react.mod.Ref
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuUnstyledMenuUnstyledDottypesMod {
  
  trait MenuUnstyledActions extends StObject {
    
    def highlightFirstItem(): Unit
    
    def highlightLastItem(): Unit
  }
  object MenuUnstyledActions {
    
    inline def apply(highlightFirstItem: Callback, highlightLastItem: Callback): MenuUnstyledActions = {
      val __obj = js.Dynamic.literal(highlightFirstItem = highlightFirstItem.toJsFn, highlightLastItem = highlightLastItem.toJsFn)
      __obj.asInstanceOf[MenuUnstyledActions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MenuUnstyledActions] (val x: Self) extends AnyVal {
      
      inline def setHighlightFirstItem(value: Callback): Self = StObject.set(x, "highlightFirstItem", value.toJsFn)
      
      inline def setHighlightLastItem(value: Callback): Self = StObject.set(x, "highlightLastItem", value.toJsFn)
    }
  }
  
  trait MenuUnstyledComponentsPropsOverrides extends StObject
  
  trait MenuUnstyledOwnProps extends StObject {
    
    /**
      * A ref with imperative actions.
      * It allows to select the first or last menu item.
      */
    var actions: js.UndefOr[Ref[MenuUnstyledActions]] = js.undefined
    
    /**
      * An HTML element, [virtualElement](https://popper.js.org/docs/v2/virtual-elements/),
      * or a function that returns either.
      * It's used to set the position of the popper.
      */
    var anchorEl: js.UndefOr[
        Null | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VirtualElement */ Any) | (js.Function0[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VirtualElement */ Any
        ])
      ] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Always keep the menu in the DOM.
      * This prop can be useful in SEO situation or when you want to maximize the responsiveness of the Menu.
      *
      * @default false
      */
    var keepMounted: js.UndefOr[Boolean] = js.undefined
    
    var listboxId: js.UndefOr[String] = js.undefined
    
    /**
      * Triggered when focus leaves the menu and the menu should close.
      */
    var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Controls whether the menu is displayed.
      * @default false
      */
    var open: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The props used for each slot inside the Menu.
      * @default {}
      */
    var slotProps: js.UndefOr[`8`] = js.undefined
    
    /**
      * The components used for each slot inside the Menu.
      * Either a string to use a HTML element or a component.
      * @default {}
      */
    var slots: js.UndefOr[ListboxRoot] = js.undefined
  }
  object MenuUnstyledOwnProps {
    
    inline def apply(): MenuUnstyledOwnProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuUnstyledOwnProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MenuUnstyledOwnProps] (val x: Self) extends AnyVal {
      
      inline def setActions(value: Ref[MenuUnstyledActions]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsFunction1(value: MenuUnstyledActions | Null => Callback): Self = StObject.set(x, "actions", js.Any.fromFunction1((t0: MenuUnstyledActions | Null) => value(t0).runNow()))
      
      inline def setActionsNull: Self = StObject.set(x, "actions", null)
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setAnchorEl(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VirtualElement */ Any) | (js.Function0[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VirtualElement */ Any
            ])
      ): Self = StObject.set(x, "anchorEl", value.asInstanceOf[js.Any])
      
      inline def setAnchorElCallbackTo(
        value: CallbackTo[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VirtualElement */ Any
            ]
      ): Self = StObject.set(x, "anchorEl", value.toJsFn)
      
      inline def setAnchorElNull: Self = StObject.set(x, "anchorEl", null)
      
      inline def setAnchorElUndefined: Self = StObject.set(x, "anchorEl", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setKeepMounted(value: Boolean): Self = StObject.set(x, "keepMounted", value.asInstanceOf[js.Any])
      
      inline def setKeepMountedUndefined: Self = StObject.set(x, "keepMounted", js.undefined)
      
      inline def setListboxId(value: String): Self = StObject.set(x, "listboxId", value.asInstanceOf[js.Any])
      
      inline def setListboxIdUndefined: Self = StObject.set(x, "listboxId", js.undefined)
      
      inline def setOnClose(value: Callback): Self = StObject.set(x, "onClose", value.toJsFn)
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setSlotProps(value: `8`): Self = StObject.set(x, "slotProps", value.asInstanceOf[js.Any])
      
      inline def setSlotPropsUndefined: Self = StObject.set(x, "slotProps", js.undefined)
      
      inline def setSlots(value: ListboxRoot): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
      
      inline def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
    }
  }
  
  trait MenuUnstyledOwnerState
    extends StObject
       with MenuUnstyledOwnProps {
    
    @JSName("open")
    var open_MenuUnstyledOwnerState: Boolean
  }
  object MenuUnstyledOwnerState {
    
    inline def apply(open: Boolean): MenuUnstyledOwnerState = {
      val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuUnstyledOwnerState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MenuUnstyledOwnerState] (val x: Self) extends AnyVal {
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    }
  }
}
