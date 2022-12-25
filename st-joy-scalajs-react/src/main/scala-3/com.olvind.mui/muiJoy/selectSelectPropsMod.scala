package com.olvind.mui.muiJoy

import com.olvind.mui.muiBase.selectUnstyledSelectUnstyledDottypesMod.SelectUnstyledCommonProps
import com.olvind.mui.muiBase.selectUnstyledUseSelectDottypesMod.SelectOption
import com.olvind.mui.muiJoy.anon.Button
import com.olvind.mui.muiJoy.anon.FocusVisible
import com.olvind.mui.muiJoy.anon.`1`
import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.ColorPaletteProp
import com.olvind.mui.muiJoy.stylesTypesThemeMod.SxProps
import com.olvind.mui.muiJoy.stylesTypesThemeMod.Theme
import com.olvind.mui.muiJoy.stylesTypesVariantsMod.VariantProp
import com.olvind.mui.muiJoy.utilsTypesMod.CreateSlotsAndSlotProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import com.olvind.mui.muiTypes.mod.OverridableStringUnion
import com.olvind.mui.muiTypes.mod.OverrideProps
import com.olvind.mui.react.mod.Ref
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
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

object selectSelectPropsMod {
  
  trait SelectOwnProps[TValue /* <: js.Object */]
    extends StObject
       with SelectStaticProps
       with CreateSlotsAndSlotProps[SelectSlot, Button] {
    
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
          /* e */ ReactMouseEventFrom[Element] | ReactKeyboardEventFrom[Element] | ReactFocusEventFrom[Element] | Null, 
          /* value */ TValue | Null, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Function that customizes the rendering of the selected value.
      */
    var renderValue: js.UndefOr[js.Function1[/* option */ SelectOption[TValue] | Null, Node]] = js.undefined
    
    /**
      * The selected value.
      * Set to `null` to deselect all options.
      */
    var value: js.UndefOr[TValue | Null] = js.undefined
  }
  object SelectOwnProps {
    
    inline def apply[TValue /* <: js.Object */](): SelectOwnProps[TValue] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectOwnProps[TValue]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectOwnProps[?], TValue /* <: js.Object */] (val x: Self & SelectOwnProps[TValue]) extends AnyVal {
      
      inline def setDefaultValue(value: TValue): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setGetSerializedValue(value: /* option */ SelectOption[TValue] | Null => js.UndefOr[String | js.Array[String] | Double]): Self = StObject.set(x, "getSerializedValue", js.Any.fromFunction1(value))
      
      inline def setGetSerializedValueUndefined: Self = StObject.set(x, "getSerializedValue", js.undefined)
      
      inline def setOnChange(
        value: (/* e */ ReactMouseEventFrom[Element] | ReactKeyboardEventFrom[Element] | ReactFocusEventFrom[Element] | Null, /* value */ TValue | Null) => Callback
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: /* e */ ReactMouseEventFrom[Element] | ReactKeyboardEventFrom[Element] | ReactFocusEventFrom[Element] | Null, t1: /* value */ TValue | Null) => (value(t0, t1)).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setRenderValue(value: /* option */ SelectOption[TValue] | Null => Node): Self = StObject.set(x, "renderValue", js.Any.fromFunction1(value))
      
      inline def setRenderValueUndefined: Self = StObject.set(x, "renderValue", js.undefined)
      
      inline def setValue(value: TValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait SelectOwnerState[TValue /* <: js.Object */]
    extends StObject
       with SelectOwnProps[TValue] {
    
    /**
      * If `true`, the select button is active.
      */
    var active: Boolean
    
    /**
      * If `true`, the select button is disabled.
      */
    @JSName("disabled")
    var disabled_SelectOwnerState: Boolean
    
    /**
      * If `true`, the select button's focus is visible.
      */
    var focusVisible: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, the select dropdown is open.
      */
    var open: Boolean
  }
  object SelectOwnerState {
    
    inline def apply[TValue /* <: js.Object */](active: Boolean, disabled: Boolean, open: Boolean): SelectOwnerState[TValue] = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectOwnerState[TValue]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectOwnerState[?], TValue /* <: js.Object */] (val x: Self & SelectOwnerState[TValue]) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setFocusVisible(value: Boolean): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
      
      inline def setFocusVisibleUndefined: Self = StObject.set(x, "focusVisible", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    }
  }
  
  type SelectProps[TValue /* <: js.Object */, D /* <: ElementType */] = (OverrideProps[SelectTypeMap[TValue, js.Object, D], D]) & `1`[D]
  
  trait SelectPropsColorOverrides extends StObject
  
  trait SelectPropsSizeOverrides extends StObject
  
  trait SelectPropsVariantOverrides extends StObject
  
  object SelectSlot {
    
    inline def button: "button" = "button".asInstanceOf["button"]
    
    inline def endDecorator: "endDecorator" = "endDecorator".asInstanceOf["endDecorator"]
    
    inline def indicator: "indicator" = "indicator".asInstanceOf["indicator"]
    
    inline def listbox: "listbox" = "listbox".asInstanceOf["listbox"]
    
    inline def root: "root" = "root".asInstanceOf["root"]
    
    inline def startDecorator: "startDecorator" = "startDecorator".asInstanceOf["startDecorator"]
  }
  type SelectSlot = "root" | "button" | "startDecorator" | "endDecorator" | "indicator" | "listbox"
  
  type SelectSlotsAndSlotProps = CreateSlotsAndSlotProps[SelectSlot, Button]
  
  trait SelectStaticProps
    extends StObject
       with SelectUnstyledCommonProps {
    
    /**
      * A ref for imperative actions. It currently only supports `focusVisible()` action.
      */
    var action: js.UndefOr[Ref[FocusVisible]] = js.undefined
    
    /**
      * The color of the component. It supports those theme colors that make sense for this component.
      * @default 'primary'
      */
    var color: js.UndefOr[OverridableStringUnion[ColorPaletteProp, SelectPropsColorOverrides]] = js.undefined
    
    /**
      * Trailing adornment for the select.
      */
    var endDecorator: js.UndefOr[Node] = js.undefined
    
    /**
      * The indicator(*) for the select.
      *    ________________
      *   [ value        * ]
      *    ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾
      */
    var indicator: js.UndefOr[Node] = js.undefined
    
    /**
      * Triggered when focus leaves the menu and the menu should close.
      */
    var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Text to show when there is no selected value.
      */
    var placeholder: js.UndefOr[Node] = js.undefined
    
    /**
      * The size of the component.
      */
    var size: js.UndefOr[OverridableStringUnion["sm" | "md" | "lg", SelectPropsSizeOverrides]] = js.undefined
    
    /**
      * Leading adornment for the select.
      */
    var startDecorator: js.UndefOr[Node] = js.undefined
    
    /**
      * The system prop that allows defining system overrides as well as additional CSS styles.
      */
    var sx: js.UndefOr[SxProps] = js.undefined
    
    /**
      * The variant to use.
      * @default 'solid'
      */
    var variant: js.UndefOr[OverridableStringUnion[VariantProp, SelectPropsVariantOverrides]] = js.undefined
  }
  object SelectStaticProps {
    
    inline def apply(): SelectStaticProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectStaticProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectStaticProps] (val x: Self) extends AnyVal {
      
      inline def setAction(value: Ref[FocusVisible]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionFunction1(value: FocusVisible | Null => Callback): Self = StObject.set(x, "action", js.Any.fromFunction1((t0: FocusVisible | Null) => value(t0).runNow()))
      
      inline def setActionNull: Self = StObject.set(x, "action", null)
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setColor(value: OverridableStringUnion[ColorPaletteProp, SelectPropsColorOverrides]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setEndDecorator(value: VdomNode): Self = StObject.set(x, "endDecorator", value.rawNode.asInstanceOf[js.Any])
      
      inline def setEndDecoratorNull: Self = StObject.set(x, "endDecorator", null)
      
      inline def setEndDecoratorUndefined: Self = StObject.set(x, "endDecorator", js.undefined)
      
      inline def setEndDecoratorVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "endDecorator", js.Array(value*))
      
      inline def setEndDecoratorVdomElement(value: VdomElement): Self = StObject.set(x, "endDecorator", value.rawElement.asInstanceOf[js.Any])
      
      inline def setIndicator(value: VdomNode): Self = StObject.set(x, "indicator", value.rawNode.asInstanceOf[js.Any])
      
      inline def setIndicatorNull: Self = StObject.set(x, "indicator", null)
      
      inline def setIndicatorUndefined: Self = StObject.set(x, "indicator", js.undefined)
      
      inline def setIndicatorVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "indicator", js.Array(value*))
      
      inline def setIndicatorVdomElement(value: VdomElement): Self = StObject.set(x, "indicator", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnClose(value: Callback): Self = StObject.set(x, "onClose", value.toJsFn)
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setPlaceholder(value: VdomNode): Self = StObject.set(x, "placeholder", value.rawNode.asInstanceOf[js.Any])
      
      inline def setPlaceholderNull: Self = StObject.set(x, "placeholder", null)
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPlaceholderVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "placeholder", js.Array(value*))
      
      inline def setPlaceholderVdomElement(value: VdomElement): Self = StObject.set(x, "placeholder", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSize(value: OverridableStringUnion["sm" | "md" | "lg", SelectPropsSizeOverrides]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStartDecorator(value: VdomNode): Self = StObject.set(x, "startDecorator", value.rawNode.asInstanceOf[js.Any])
      
      inline def setStartDecoratorNull: Self = StObject.set(x, "startDecorator", null)
      
      inline def setStartDecoratorUndefined: Self = StObject.set(x, "startDecorator", js.undefined)
      
      inline def setStartDecoratorVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "startDecorator", js.Array(value*))
      
      inline def setStartDecoratorVdomElement(value: VdomElement): Self = StObject.set(x, "startDecorator", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSx(value: SxProps): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
      
      inline def setSxFunction1(value: Theme => SystemStyleObject[Theme]): Self = StObject.set(x, "sx", js.Any.fromFunction1(value))
      
      inline def setSxNull: Self = StObject.set(x, "sx", null)
      
      inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
      
      inline def setSxVarargs(value: (Boolean | SystemStyleObject[Theme] | (js.Function1[Theme, SystemStyleObject[Theme]]))*): Self = StObject.set(x, "sx", js.Array(value*))
      
      inline def setVariant(value: OverridableStringUnion[VariantProp, SelectPropsVariantOverrides]): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
  
  trait SelectTypeMap[TValue /* <: js.Object */, P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & SelectOwnProps[TValue]
  }
  object SelectTypeMap {
    
    inline def apply[TValue /* <: js.Object */, P, D /* <: ElementType */](defaultComponent: D, props: P & SelectOwnProps[TValue]): SelectTypeMap[TValue, P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectTypeMap[TValue, P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectTypeMap[?, ?, ?], TValue /* <: js.Object */, P, D /* <: ElementType */] (val x: Self & (SelectTypeMap[TValue, P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & SelectOwnProps[TValue]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
