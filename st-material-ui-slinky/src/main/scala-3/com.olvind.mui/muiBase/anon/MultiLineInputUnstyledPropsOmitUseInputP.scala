package com.olvind.mui.muiBase.anon

import com.olvind.mui.react.mod.ChangeEvent
import com.olvind.mui.react.mod.ChangeEventHandler
import com.olvind.mui.react.mod.FocusEventHandler
import com.olvind.mui.react.mod.KeyboardEventHandler
import com.olvind.mui.react.mod.MouseEventHandler
import com.olvind.mui.react.mod.Ref
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLInputElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @mui/base.@mui/base/InputUnstyled/InputUnstyled.types.MultiLineInputUnstyledProps & Omit<UseInputParameters, 'error'> & {  aria-describedby :string | undefined,   aria-label :string | undefined,   aria-labelledby :string | undefined,   autoComplete :string | undefined,   autoFocus :boolean | undefined,   className :string | undefined,   endAdornment :react.react.ReactNode | undefined,   error :boolean | undefined,   id :string | undefined,   name :string | undefined,   onKeyDown :react.react.KeyboardEventHandler<std.HTMLInputElement> | undefined,   onKeyUp :react.react.KeyboardEventHandler<std.HTMLInputElement> | undefined,   placeholder :string | undefined,   readOnly :boolean | undefined,   slotProps :{  root :@mui/base.@mui/base/utils.SlotComponentProps<'div', @mui/base.@mui/base/InputUnstyled/InputUnstyled.types.InputUnstyledComponentsPropsOverrides, @mui/base.@mui/base/InputUnstyled/InputUnstyled.types.InputUnstyledOwnerState> | undefined,   input :@mui/base.@mui/base/utils.SlotComponentProps<'input', @mui/base.@mui/base/InputUnstyled/InputUnstyled.types.InputUnstyledComponentsPropsOverrides, @mui/base.@mui/base/InputUnstyled/InputUnstyled.types.InputUnstyledOwnerState> | undefined} | undefined,   slots :{  root :react.react.ElementType<any> | undefined,   input :react.react.ElementType<any> | undefined,   textarea :react.react.ElementType<any> | undefined} | undefined,   startAdornment :react.react.ReactNode | undefined,   value :unknown | undefined} */
trait MultiLineInputUnstyledPropsOmitUseInputP extends StObject {
  
  var `aria-describedby`: js.UndefOr[String] = js.undefined
  
  var `aria-label`: js.UndefOr[String] = js.undefined
  
  var `aria-labelledby`: js.UndefOr[String] = js.undefined
  
  /**
    * This prop helps users to fill forms faster, especially on mobile devices.
    * The name can be confusing, as it's more like an autofill.
    * You can learn more about it [following the specification](https://html.spec.whatwg.org/multipage/form-control-infrastructure.html#autofill).
    */
  var autoComplete: js.UndefOr[String] = js.undefined
  
  /**
    * If `true`, the `input` element is focused during the first mount.
    */
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Class name applied to the root element.
    */
  var className: js.UndefOr[String] = js.undefined
  
  var defaultValue: js.UndefOr[Any] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Trailing adornment for this input.
    */
  var endAdornment: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * If `true`, the `input` will indicate an error by setting the `aria-invalid` attribute on the input and the `Mui-error` class on the root element.
    * The prop defaults to the value (`false`) inherited from the parent FormControl component.
    */
  var error: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The id of the `input` element.
    */
  var id: js.UndefOr[String] = js.undefined
  
  var inputRef: js.UndefOr[Ref[HTMLInputElement]] = js.undefined
  
  /**
    * Maximum number of rows to display when multiline option is set to true.
    */
  var maxRows: js.UndefOr[Double] = js.undefined
  
  /**
    * Minimum number of rows to display when multiline option is set to true.
    */
  var minRows: js.UndefOr[Double] = js.undefined
  
  /**
    * If `true`, a `textarea` element is rendered.
    * @default false
    */
  var multiline: true
  
  /**
    * Name attribute of the `input` element.
    */
  var name: js.UndefOr[String] = js.undefined
  
  var onBlur: js.UndefOr[FocusEventHandler[Element]] = js.undefined
  
  var onChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
  
  var onClick: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  
  var onFocus: js.UndefOr[FocusEventHandler[Element]] = js.undefined
  
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
  
  var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
  
  /**
    * The short hint displayed in the `input` before the user enters a value.
    */
  var placeholder: js.UndefOr[String] = js.undefined
  
  /**
    * It prevents the user from changing the value of the field
    * (not from interacting with the field).
    */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Number of rows to display when multiline option is set to true.
    */
  var rows: js.UndefOr[Double] = js.undefined
  
  /**
    * The props used for each slot inside the Input.
    * @default {}
    */
  var slotProps: js.UndefOr[Input] = js.undefined
  
  /**
    * The components used for each slot inside the InputBase.
    * Either a string to use a HTML element or a component.
    * @default {}
    */
  var slots: js.UndefOr[Textarea] = js.undefined
  
  /**
    * Leading adornment for this input.
    */
  var startAdornment: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * Type of the `input` element. It should be [a valid HTML5 input type](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input#Form_%3Cinput%3E_types).
    * @default 'text'
    */
  var `type`: Unit
  
  /**
    * The value of the `input` element, required for a controlled component.
    */
  var value: js.UndefOr[Any] = js.undefined
}
object MultiLineInputUnstyledPropsOmitUseInputP {
  
  inline def apply(`type`: Unit): MultiLineInputUnstyledPropsOmitUseInputP = {
    val __obj = js.Dynamic.literal(multiline = true)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiLineInputUnstyledPropsOmitUseInputP]
  }
  
  extension [Self <: MultiLineInputUnstyledPropsOmitUseInputP](x: Self) {
    
    inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
    
    inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
    
    inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
    
    inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
    
    inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
    
    inline def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
    
    inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
    
    inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setDefaultValue(value: Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setEndAdornment(value: ReactElement): Self = StObject.set(x, "endAdornment", value.asInstanceOf[js.Any])
    
    inline def setEndAdornmentUndefined: Self = StObject.set(x, "endAdornment", js.undefined)
    
    inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInputRef(value: Ref[HTMLInputElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
    
    inline def setInputRefFunction1(value: /* instance */ HTMLInputElement | Null => Unit): Self = StObject.set(x, "inputRef", js.Any.fromFunction1(value))
    
    inline def setInputRefNull: Self = StObject.set(x, "inputRef", null)
    
    inline def setInputRefReactRef(value: ReactRef[HTMLInputElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
    
    inline def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
    
    inline def setMaxRows(value: Double): Self = StObject.set(x, "maxRows", value.asInstanceOf[js.Any])
    
    inline def setMaxRowsUndefined: Self = StObject.set(x, "maxRows", js.undefined)
    
    inline def setMinRows(value: Double): Self = StObject.set(x, "minRows", value.asInstanceOf[js.Any])
    
    inline def setMinRowsUndefined: Self = StObject.set(x, "minRows", js.undefined)
    
    inline def setMultiline(value: true): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnBlur(value: SyntheticFocusEvent[Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnChange(value: ChangeEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnClick(value: SyntheticMouseEvent[Element] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnFocus(value: SyntheticFocusEvent[Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnKeyDown(value: SyntheticKeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    inline def setOnKeyUp(value: SyntheticKeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
    
    inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setSlotProps(value: Input): Self = StObject.set(x, "slotProps", value.asInstanceOf[js.Any])
    
    inline def setSlotPropsUndefined: Self = StObject.set(x, "slotProps", js.undefined)
    
    inline def setSlots(value: Textarea): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
    
    inline def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
    
    inline def setStartAdornment(value: ReactElement): Self = StObject.set(x, "startAdornment", value.asInstanceOf[js.Any])
    
    inline def setStartAdornmentUndefined: Self = StObject.set(x, "startAdornment", js.undefined)
    
    inline def setType(value: Unit): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
