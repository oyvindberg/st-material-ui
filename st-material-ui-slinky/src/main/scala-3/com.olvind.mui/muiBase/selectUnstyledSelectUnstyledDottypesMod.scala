package com.olvind.mui.muiBase

import com.olvind.mui.muiBase.anon.ListboxPopperRoot
import com.olvind.mui.muiBase.anon.Placement
import com.olvind.mui.muiBase.anon.PopperRoot
import com.olvind.mui.muiBase.popperUnstyledPopperUnstyledMod.PopperPlacementType
import com.olvind.mui.muiBase.selectUnstyledUseSelectDottypesMod.SelectOption
import org.scalajs.dom.Element
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectUnstyledSelectUnstyledDottypesMod {
  
  trait SelectUnstyledCommonProps extends StObject {
    
    /**
      * If `true`, the select element is focused during the first mount
      * @default false
      */
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactElement] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * If `true`, the select will be initially open.
      * @default false
      */
    var defaultListboxOpen: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, the select is disabled.
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * `id` attribute of the listbox element.
      * Also used to derive the `id` attributes of options.
      */
    var listboxId: js.UndefOr[String] = js.undefined
    
    /**
      * Controls the open state of the select's listbox.
      * @default undefined
      */
    var listboxOpen: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Name of the element. For example used by the server to identify the fields in form submits.
      * If the name is provided, the component will render a hidden input element that can be submitted to a server.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Callback fired when the component requests to be opened.
      * Use in controlled mode (see listboxOpen).
      */
    var onListboxOpenChange: js.UndefOr[js.Function1[/* isOpen */ Boolean, Unit]] = js.undefined
  }
  object SelectUnstyledCommonProps {
    
    inline def apply(): SelectUnstyledCommonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectUnstyledCommonProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectUnstyledCommonProps] (val x: Self) extends AnyVal {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDefaultListboxOpen(value: Boolean): Self = StObject.set(x, "defaultListboxOpen", value.asInstanceOf[js.Any])
      
      inline def setDefaultListboxOpenUndefined: Self = StObject.set(x, "defaultListboxOpen", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setListboxId(value: String): Self = StObject.set(x, "listboxId", value.asInstanceOf[js.Any])
      
      inline def setListboxIdUndefined: Self = StObject.set(x, "listboxId", js.undefined)
      
      inline def setListboxOpen(value: Boolean): Self = StObject.set(x, "listboxOpen", value.asInstanceOf[js.Any])
      
      inline def setListboxOpenUndefined: Self = StObject.set(x, "listboxOpen", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnListboxOpenChange(value: /* isOpen */ Boolean => Unit): Self = StObject.set(x, "onListboxOpenChange", js.Any.fromFunction1(value))
      
      inline def setOnListboxOpenChangeUndefined: Self = StObject.set(x, "onListboxOpenChange", js.undefined)
    }
  }
  
  trait SelectUnstyledComponentsPropsOverrides extends StObject
  
  trait SelectUnstyledOwnProps[TValue /* <: js.Object */]
    extends StObject
       with SelectUnstyledCommonProps {
    
    /**
      * The default selected value. Use when the component is not controlled.
      */
    var defaultValue: js.UndefOr[TValue | Null] = js.undefined
    
    /**
      * A function to convert the currently selected value to a string.
      * Used to set a value of a hidden input associated with the select,
      * so that the selected value can be posted with a form.
      */
    var getSerializedValue: js.UndefOr[
        js.Function1[
          /* option */ SelectOption[TValue] | Null, 
          js.UndefOr[String | js.Array[String] | Double]
        ]
      ] = js.undefined
    
    /**
      * Callback fired when an option is selected.
      */
    var onChange: js.UndefOr[
        js.Function2[
          /* e */ SyntheticMouseEvent[Element] | SyntheticKeyboardEvent[Element] | SyntheticFocusEvent[Element] | Null, 
          /* value */ TValue | Null, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * A function used to convert the option label to a string.
      * It's useful when labels are elements and need to be converted to plain text
      * to enable navigation using character keys on a keyboard.
      *
      * @default defaultOptionStringifier
      */
    var optionStringifier: js.UndefOr[js.Function1[/* option */ SelectOption[TValue], String]] = js.undefined
    
    /**
      * Function that customizes the rendering of the selected value.
      */
    var renderValue: js.UndefOr[js.Function1[/* option */ SelectOption[TValue] | Null, ReactElement]] = js.undefined
    
    /**
      * The props used for each slot inside the Input.
      * @default {}
      */
    var slotProps: js.UndefOr[PopperRoot[TValue]] = js.undefined
    
    /**
      * The components used for each slot inside the Select.
      * Either a string to use a HTML element or a component.
      * @default {}
      */
    var slots: js.UndefOr[ListboxPopperRoot[TValue]] = js.undefined
    
    /**
      * The selected value.
      * Set to `null` to deselect all options.
      */
    var value: js.UndefOr[TValue | Null] = js.undefined
  }
  object SelectUnstyledOwnProps {
    
    inline def apply[TValue /* <: js.Object */](): SelectUnstyledOwnProps[TValue] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectUnstyledOwnProps[TValue]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectUnstyledOwnProps[?], TValue /* <: js.Object */] (val x: Self & SelectUnstyledOwnProps[TValue]) extends AnyVal {
      
      inline def setDefaultValue(value: TValue): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setGetSerializedValue(value: /* option */ SelectOption[TValue] | Null => js.UndefOr[String | js.Array[String] | Double]): Self = StObject.set(x, "getSerializedValue", js.Any.fromFunction1(value))
      
      inline def setGetSerializedValueUndefined: Self = StObject.set(x, "getSerializedValue", js.undefined)
      
      inline def setOnChange(
        value: (/* e */ SyntheticMouseEvent[Element] | SyntheticKeyboardEvent[Element] | SyntheticFocusEvent[Element] | Null, /* value */ TValue | Null) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOptionStringifier(value: /* option */ SelectOption[TValue] => String): Self = StObject.set(x, "optionStringifier", js.Any.fromFunction1(value))
      
      inline def setOptionStringifierUndefined: Self = StObject.set(x, "optionStringifier", js.undefined)
      
      inline def setRenderValue(value: /* option */ SelectOption[TValue] | Null => ReactElement): Self = StObject.set(x, "renderValue", js.Any.fromFunction1(value))
      
      inline def setRenderValueUndefined: Self = StObject.set(x, "renderValue", js.undefined)
      
      inline def setSlotProps(value: PopperRoot[TValue]): Self = StObject.set(x, "slotProps", value.asInstanceOf[js.Any])
      
      inline def setSlotPropsUndefined: Self = StObject.set(x, "slotProps", js.undefined)
      
      inline def setSlots(value: ListboxPopperRoot[TValue]): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
      
      inline def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
      
      inline def setValue(value: TValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait SelectUnstyledOwnerState[TValue /* <: js.Object */]
    extends StObject
       with SelectUnstyledOwnProps[TValue] {
    
    var active: Boolean
    
    @JSName("disabled")
    var disabled_SelectUnstyledOwnerState: Boolean
    
    var focusVisible: Boolean
    
    var open: Boolean
  }
  object SelectUnstyledOwnerState {
    
    inline def apply[TValue /* <: js.Object */](active: Boolean, disabled: Boolean, focusVisible: Boolean, open: Boolean): SelectUnstyledOwnerState[TValue] = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], focusVisible = focusVisible.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectUnstyledOwnerState[TValue]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectUnstyledOwnerState[?], TValue /* <: js.Object */] (val x: Self & SelectUnstyledOwnerState[TValue]) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setFocusVisible(value: Boolean): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    }
  }
  
  trait SelectUnstyledPopperSlotProps[TValue /* <: js.Object */] extends StObject {
    
    var anchorEl: js.UndefOr[
        Null | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VirtualElement */ Any) | (js.Function0[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VirtualElement */ Any
        ])
      ] = js.undefined
    
    var children: js.UndefOr[ReactElement | (js.Function1[/* props */ Placement, ReactElement])] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var disablePortal: js.UndefOr[Boolean] = js.undefined
    
    var open: Boolean
    
    var ownerState: SelectUnstyledOwnerState[TValue]
    
    var placement: js.UndefOr[PopperPlacementType] = js.undefined
  }
  object SelectUnstyledPopperSlotProps {
    
    inline def apply[TValue /* <: js.Object */](open: Boolean, ownerState: SelectUnstyledOwnerState[TValue]): SelectUnstyledPopperSlotProps[TValue] = {
      val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any], ownerState = ownerState.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectUnstyledPopperSlotProps[TValue]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectUnstyledPopperSlotProps[?], TValue /* <: js.Object */] (val x: Self & SelectUnstyledPopperSlotProps[TValue]) extends AnyVal {
      
      inline def setAnchorEl(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VirtualElement */ Any) | (js.Function0[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VirtualElement */ Any
            ])
      ): Self = StObject.set(x, "anchorEl", value.asInstanceOf[js.Any])
      
      inline def setAnchorElFunction0(
        value: () => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VirtualElement */ Any
      ): Self = StObject.set(x, "anchorEl", js.Any.fromFunction0(value))
      
      inline def setAnchorElNull: Self = StObject.set(x, "anchorEl", null)
      
      inline def setAnchorElUndefined: Self = StObject.set(x, "anchorEl", js.undefined)
      
      inline def setChildren(value: ReactElement | (js.Function1[/* props */ Placement, ReactElement])): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* props */ Placement => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisablePortal(value: Boolean): Self = StObject.set(x, "disablePortal", value.asInstanceOf[js.Any])
      
      inline def setDisablePortalUndefined: Self = StObject.set(x, "disablePortal", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOwnerState(value: SelectUnstyledOwnerState[TValue]): Self = StObject.set(x, "ownerState", value.asInstanceOf[js.Any])
      
      inline def setPlacement(value: PopperPlacementType): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    }
  }
  
  trait SelectUnstyledTypeMap[TValue /* <: js.Object */, P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & SelectUnstyledOwnProps[TValue]
  }
  object SelectUnstyledTypeMap {
    
    inline def apply[TValue /* <: js.Object */, P, D /* <: ReactElement */](defaultComponent: D, props: P & SelectUnstyledOwnProps[TValue]): SelectUnstyledTypeMap[TValue, P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectUnstyledTypeMap[TValue, P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectUnstyledTypeMap[?, ?, ?], TValue /* <: js.Object */, P, D /* <: ReactElement */] (val x: Self & (SelectUnstyledTypeMap[TValue, P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & SelectUnstyledOwnProps[TValue]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
