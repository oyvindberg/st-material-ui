package com.olvind.mui.muiBase

import com.olvind.mui.muiBase.anon.ListboxRoot
import com.olvind.mui.react.mod.Ref
import org.scalajs.dom.HTMLElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuUnstyledMenuUnstyledDottypesMod {
  
  trait MenuUnstyledActions extends StObject {
    
    def highlightFirstItem(): Unit
    
    def highlightLastItem(): Unit
  }
  object MenuUnstyledActions {
    
    inline def apply(highlightFirstItem: () => Unit, highlightLastItem: () => Unit): MenuUnstyledActions = {
      val __obj = js.Dynamic.literal(highlightFirstItem = js.Any.fromFunction0(highlightFirstItem), highlightLastItem = js.Any.fromFunction0(highlightLastItem))
      __obj.asInstanceOf[MenuUnstyledActions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MenuUnstyledActions] (val x: Self) extends AnyVal {
      
      inline def setHighlightFirstItem(value: () => Unit): Self = StObject.set(x, "highlightFirstItem", js.Any.fromFunction0(value))
      
      inline def setHighlightLastItem(value: () => Unit): Self = StObject.set(x, "highlightLastItem", js.Any.fromFunction0(value))
    }
  }
  
  trait MenuUnstyledListboxSlotPropsOverrides extends StObject
  
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
        Null | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VirtualElement */ Any) | HTMLElement | (js.Function0[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VirtualElement */ Any) | HTMLElement
        ])
      ] = js.undefined
    
    var children: js.UndefOr[ReactElement] = js.undefined
    
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
    var slotProps: js.UndefOr[ListboxRoot] = js.undefined
    
    /**
      * The components used for each slot inside the Menu.
      * Either a string to use a HTML element or a component.
      * @default {}
      */
    var slots: js.UndefOr[MenuUnstyledSlots] = js.undefined
  }
  object MenuUnstyledOwnProps {
    
    inline def apply(): MenuUnstyledOwnProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuUnstyledOwnProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MenuUnstyledOwnProps] (val x: Self) extends AnyVal {
      
      inline def setActions(value: Ref[MenuUnstyledActions]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsFunction1(value: /* instance */ MenuUnstyledActions | Null => Unit): Self = StObject.set(x, "actions", js.Any.fromFunction1(value))
      
      inline def setActionsNull: Self = StObject.set(x, "actions", null)
      
      inline def setActionsReactRef(value: ReactRef[MenuUnstyledActions]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setAnchorEl(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VirtualElement */ Any) | HTMLElement | (js.Function0[
              (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VirtualElement */ Any) | HTMLElement
            ])
      ): Self = StObject.set(x, "anchorEl", value.asInstanceOf[js.Any])
      
      inline def setAnchorElFunction0(
        value: () => (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VirtualElement */ Any) | HTMLElement
      ): Self = StObject.set(x, "anchorEl", js.Any.fromFunction0(value))
      
      inline def setAnchorElNull: Self = StObject.set(x, "anchorEl", null)
      
      inline def setAnchorElUndefined: Self = StObject.set(x, "anchorEl", js.undefined)
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setKeepMounted(value: Boolean): Self = StObject.set(x, "keepMounted", value.asInstanceOf[js.Any])
      
      inline def setKeepMountedUndefined: Self = StObject.set(x, "keepMounted", js.undefined)
      
      inline def setListboxId(value: String): Self = StObject.set(x, "listboxId", value.asInstanceOf[js.Any])
      
      inline def setListboxIdUndefined: Self = StObject.set(x, "listboxId", js.undefined)
      
      inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setSlotProps(value: ListboxRoot): Self = StObject.set(x, "slotProps", value.asInstanceOf[js.Any])
      
      inline def setSlotPropsUndefined: Self = StObject.set(x, "slotProps", js.undefined)
      
      inline def setSlots(value: MenuUnstyledSlots): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
      
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
  
  trait MenuUnstyledRootSlotPropsOverrides extends StObject
  
  trait MenuUnstyledSlots extends StObject {
    
    /**
      * The component that renders the listbox.
      * @default 'ul'
      */
    var listbox: js.UndefOr[ReactElement] = js.undefined
    
    /**
      * The component that renders the root.
      * @default PopperUnstyled
      */
    var root: js.UndefOr[ReactElement] = js.undefined
  }
  object MenuUnstyledSlots {
    
    inline def apply(): MenuUnstyledSlots = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuUnstyledSlots]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MenuUnstyledSlots] (val x: Self) extends AnyVal {
      
      inline def setListbox(value: ReactElement): Self = StObject.set(x, "listbox", value.asInstanceOf[js.Any])
      
      inline def setListboxUndefined: Self = StObject.set(x, "listbox", js.undefined)
      
      inline def setRoot(value: ReactElement): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
