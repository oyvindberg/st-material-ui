package com.olvind.mui.muiBase

import com.olvind.mui.muiBase.formControlUnstyledFormControlUnstyledDottypesMod.FormControlUnstyledState
import com.olvind.mui.react.mod.ChangeEvent
import com.olvind.mui.react.mod.ChangeEventHandler
import com.olvind.mui.react.mod.FocusEventHandler
import com.olvind.mui.react.mod.MouseEventHandler
import com.olvind.mui.react.mod.Ref
import com.olvind.mui.std.Omit
import com.olvind.mui.std.Record
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLInputElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useInputUseInputDottypesMod {
  
  trait UseInputInputSlotOwnProps extends StObject {
    
    var `aria-invalid`: js.UndefOr[Boolean | "grammar" | "spelling"] = js.undefined
    
    var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
    
    var disabled: Boolean
    
    var onBlur: FocusEventHandler[Element]
    
    var onChange: ChangeEventHandler[HTMLInputElement]
    
    var onFocus: FocusEventHandler[Element]
    
    var ref: Ref[HTMLInputElement]
    
    var required: Boolean
    
    var value: js.UndefOr[String | Double | js.Array[String]] = js.undefined
  }
  object UseInputInputSlotOwnProps {
    
    inline def apply(
      disabled: Boolean,
      onBlur: SyntheticFocusEvent[Element] => Unit,
      onChange: ChangeEvent[HTMLInputElement] => Unit,
      onFocus: SyntheticFocusEvent[Element] => Unit,
      required: Boolean
    ): UseInputInputSlotOwnProps = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], onBlur = js.Any.fromFunction1(onBlur), onChange = js.Any.fromFunction1(onChange), onFocus = js.Any.fromFunction1(onFocus), required = required.asInstanceOf[js.Any], ref = null)
      __obj.asInstanceOf[UseInputInputSlotOwnProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UseInputInputSlotOwnProps] (val x: Self) extends AnyVal {
      
      inline def `setAria-invalid`(value: Boolean | "grammar" | "spelling"): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
      
      inline def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
      
      inline def setDefaultValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value*))
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setOnBlur(value: SyntheticFocusEvent[Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnChange(value: ChangeEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnFocus(value: SyntheticFocusEvent[Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setRef(value: Ref[HTMLInputElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ HTMLInputElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefReactRef(value: ReactRef[HTMLInputElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
  
  type UseInputInputSlotProps[TOther] = (Omit[
    TOther, 
    "aria-invalid" | "defaultValue" | "ref" | "value" | "onBlur" | "onChange" | "onFocus" | "required" | "disabled"
  ]) & UseInputInputSlotOwnProps
  
  @js.native
  trait UseInputReturnValue extends StObject {
    
    /**
      * If `true`, the component will be disabled.
      * @default false
      */
    var disabled: Boolean = js.native
    
    /**
      * If `true`, the `input` will indicate an error by setting the `aria-invalid` attribute.
      * @default false
      */
    var error: Boolean = js.native
    
    /**
      * If `true`, the `input` will be focused.
      * @default false
      */
    var focused: Boolean = js.native
    
    /**
      * Return value from the `useFormControlUnstyledContext` hook.
      */
    var formControlContext: js.UndefOr[FormControlUnstyledState] = js.native
    
    /**
      * Resolver for the input slot's props.
      * @param externalProps props for the input slot
      * @returns props that should be spread on the input slot
      */
    def getInputProps[TOther /* <: Record[String, Any] */](): UseInputInputSlotProps[TOther] = js.native
    def getInputProps[TOther /* <: Record[String, Any] */](externalProps: TOther): UseInputInputSlotProps[TOther] = js.native
    
    /**
      * Resolver for the root slot's props.
      * @param externalProps props for the root slot
      * @returns props that should be spread on the root slot
      */
    def getRootProps[TOther /* <: Record[String, Any] */](): UseInputRootSlotProps[TOther] = js.native
    def getRootProps[TOther /* <: Record[String, Any] */](externalProps: TOther): UseInputRootSlotProps[TOther] = js.native
    
    /**
      * If `true`, the `input` will indicate that it's required.
      * @default false
      */
    var required: Boolean = js.native
    
    /**
      * The `value` of the `input` element.
      */
    var value: Any = js.native
  }
  
  trait UseInputRootSlotOwnProps extends StObject {
    
    var onClick: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  }
  object UseInputRootSlotOwnProps {
    
    inline def apply(): UseInputRootSlotOwnProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseInputRootSlotOwnProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UseInputRootSlotOwnProps] (val x: Self) extends AnyVal {
      
      inline def setOnClick(value: SyntheticMouseEvent[Element] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    }
  }
  
  type UseInputRootSlotProps[TOther] = (Omit[TOther, "onClick" | "onBlur" | "onChange" | "onFocus"]) & UseInputRootSlotOwnProps
}
