package com.olvind.mui.muiBase

import com.olvind.mui.muiBase.anon.Datatagindex
import com.olvind.mui.muiBase.anon.IndexNumber
import com.olvind.mui.muiBase.muiBaseBooleans.`false`
import com.olvind.mui.muiBase.muiBaseBooleans.`true`
import com.olvind.mui.muiBase.muiBaseStrings.any
import com.olvind.mui.muiBase.muiBaseStrings.mouse
import com.olvind.mui.muiBase.muiBaseStrings.start
import com.olvind.mui.muiBase.muiBaseStrings.touch
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useAutocompleteMod {
  
  trait AutocompleteChangeDetails[T] extends StObject {
    
    var option: T
  }
  object AutocompleteChangeDetails {
    
    inline def apply[T](option: T): AutocompleteChangeDetails[T] = {
      val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutocompleteChangeDetails[T]]
    }
    
    extension [Self <: AutocompleteChangeDetails[?], T](x: Self & AutocompleteChangeDetails[T]) {
      
      inline def setOption(value: T): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiBase.muiBaseStrings.createOption
    - `com.olvind.mui`.muiBase.muiBaseStrings.selectOption
    - `com.olvind.mui`.muiBase.muiBaseStrings.removeOption
    - `com.olvind.mui`.muiBase.muiBaseStrings.clear
    - `com.olvind.mui`.muiBase.muiBaseStrings.blur
  */
  trait AutocompleteChangeReason extends StObject
  object AutocompleteChangeReason {
    
    inline def blur: com.olvind.mui.muiBase.muiBaseStrings.blur = "blur".asInstanceOf[com.olvind.mui.muiBase.muiBaseStrings.blur]
    
    inline def clear: com.olvind.mui.muiBase.muiBaseStrings.clear = "clear".asInstanceOf[com.olvind.mui.muiBase.muiBaseStrings.clear]
    
    inline def createOption: com.olvind.mui.muiBase.muiBaseStrings.createOption = "createOption".asInstanceOf[com.olvind.mui.muiBase.muiBaseStrings.createOption]
    
    inline def removeOption: com.olvind.mui.muiBase.muiBaseStrings.removeOption = "removeOption".asInstanceOf[com.olvind.mui.muiBase.muiBaseStrings.removeOption]
    
    inline def selectOption: com.olvind.mui.muiBase.muiBaseStrings.selectOption = "selectOption".asInstanceOf[com.olvind.mui.muiBase.muiBaseStrings.selectOption]
  }
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiBase.muiBaseStrings.createOption
    - `com.olvind.mui`.muiBase.muiBaseStrings.toggleInput
    - `com.olvind.mui`.muiBase.muiBaseStrings.escape
    - `com.olvind.mui`.muiBase.muiBaseStrings.selectOption
    - `com.olvind.mui`.muiBase.muiBaseStrings.removeOption
    - `com.olvind.mui`.muiBase.muiBaseStrings.blur
  */
  trait AutocompleteCloseReason extends StObject
  object AutocompleteCloseReason {
    
    inline def blur: com.olvind.mui.muiBase.muiBaseStrings.blur = "blur".asInstanceOf[com.olvind.mui.muiBase.muiBaseStrings.blur]
    
    inline def createOption: com.olvind.mui.muiBase.muiBaseStrings.createOption = "createOption".asInstanceOf[com.olvind.mui.muiBase.muiBaseStrings.createOption]
    
    inline def escape: com.olvind.mui.muiBase.muiBaseStrings.escape = "escape".asInstanceOf[com.olvind.mui.muiBase.muiBaseStrings.escape]
    
    inline def removeOption: com.olvind.mui.muiBase.muiBaseStrings.removeOption = "removeOption".asInstanceOf[com.olvind.mui.muiBase.muiBaseStrings.removeOption]
    
    inline def selectOption: com.olvind.mui.muiBase.muiBaseStrings.selectOption = "selectOption".asInstanceOf[com.olvind.mui.muiBase.muiBaseStrings.selectOption]
    
    inline def toggleInput: com.olvind.mui.muiBase.muiBaseStrings.toggleInput = "toggleInput".asInstanceOf[com.olvind.mui.muiBase.muiBaseStrings.toggleInput]
  }
  
  type AutocompleteFreeSoloValueMapping[FreeSolo] = String
  
  type AutocompleteGetTagProps = js.Function1[/* hasIndex */ IndexNumber, Datatagindex]
  
  trait AutocompleteGroupedOption[T] extends StObject {
    
    var group: String
    
    var index: Double
    
    var key: Double
    
    var options: js.Array[T]
  }
  object AutocompleteGroupedOption {
    
    inline def apply[T](group: String, index: Double, key: Double, options: js.Array[T]): AutocompleteGroupedOption[T] = {
      val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutocompleteGroupedOption[T]]
    }
    
    extension [Self <: AutocompleteGroupedOption[?], T](x: Self & AutocompleteGroupedOption[T]) {
      
      inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: js.Array[T]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: T*): Self = StObject.set(x, "options", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiBase.muiBaseStrings.keyboard
    - `com.olvind.mui`.muiBase.muiBaseStrings.mouse
    - `com.olvind.mui`.muiBase.muiBaseStrings.auto
  */
  trait AutocompleteHighlightChangeReason extends StObject
  object AutocompleteHighlightChangeReason {
    
    inline def auto: com.olvind.mui.muiBase.muiBaseStrings.auto = "auto".asInstanceOf[com.olvind.mui.muiBase.muiBaseStrings.auto]
    
    inline def keyboard: com.olvind.mui.muiBase.muiBaseStrings.keyboard = "keyboard".asInstanceOf[com.olvind.mui.muiBase.muiBaseStrings.keyboard]
    
    inline def mouse: com.olvind.mui.muiBase.muiBaseStrings.mouse = "mouse".asInstanceOf[com.olvind.mui.muiBase.muiBaseStrings.mouse]
  }
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiBase.muiBaseStrings.input
    - `com.olvind.mui`.muiBase.muiBaseStrings.reset
    - `com.olvind.mui`.muiBase.muiBaseStrings.clear
  */
  trait AutocompleteInputChangeReason extends StObject
  object AutocompleteInputChangeReason {
    
    inline def clear: com.olvind.mui.muiBase.muiBaseStrings.clear = "clear".asInstanceOf[com.olvind.mui.muiBase.muiBaseStrings.clear]
    
    inline def input: com.olvind.mui.muiBase.muiBaseStrings.input = "input".asInstanceOf[com.olvind.mui.muiBase.muiBaseStrings.input]
    
    inline def reset: com.olvind.mui.muiBase.muiBaseStrings.reset = "reset".asInstanceOf[com.olvind.mui.muiBase.muiBaseStrings.reset]
  }
  
  type AutocompleteValue[T, Multiple, DisableClearable, FreeSolo] = (js.Array[T | AutocompleteFreeSoloValueMapping[FreeSolo]]) | T | Null | AutocompleteFreeSoloValueMapping[FreeSolo]
  
  trait CreateFilterOptionsConfig[T] extends StObject {
    
    var ignoreAccents: js.UndefOr[Boolean] = js.undefined
    
    var ignoreCase: js.UndefOr[Boolean] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var matchFrom: js.UndefOr[any | start] = js.undefined
    
    var stringify: js.UndefOr[js.Function1[/* option */ T, String]] = js.undefined
    
    var trim: js.UndefOr[Boolean] = js.undefined
  }
  object CreateFilterOptionsConfig {
    
    inline def apply[T](): CreateFilterOptionsConfig[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateFilterOptionsConfig[T]]
    }
    
    extension [Self <: CreateFilterOptionsConfig[?], T](x: Self & CreateFilterOptionsConfig[T]) {
      
      inline def setIgnoreAccents(value: Boolean): Self = StObject.set(x, "ignoreAccents", value.asInstanceOf[js.Any])
      
      inline def setIgnoreAccentsUndefined: Self = StObject.set(x, "ignoreAccents", js.undefined)
      
      inline def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
      
      inline def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setMatchFrom(value: any | start): Self = StObject.set(x, "matchFrom", value.asInstanceOf[js.Any])
      
      inline def setMatchFromUndefined: Self = StObject.set(x, "matchFrom", js.undefined)
      
      inline def setStringify(value: /* option */ T => String): Self = StObject.set(x, "stringify", js.Any.fromFunction1(value))
      
      inline def setStringifyUndefined: Self = StObject.set(x, "stringify", js.undefined)
      
      inline def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
    }
  }
  
  trait FilterOptionsState[T] extends StObject {
    
    def getOptionLabel(option: T): String
    
    var inputValue: String
  }
  object FilterOptionsState {
    
    inline def apply[T](getOptionLabel: T => String, inputValue: String): FilterOptionsState[T] = {
      val __obj = js.Dynamic.literal(getOptionLabel = js.Any.fromFunction1(getOptionLabel), inputValue = inputValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilterOptionsState[T]]
    }
    
    extension [Self <: FilterOptionsState[?], T](x: Self & FilterOptionsState[T]) {
      
      inline def setGetOptionLabel(value: T => String): Self = StObject.set(x, "getOptionLabel", js.Any.fromFunction1(value))
      
      inline def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
    }
  }
  
  trait UseAutocompleteProps[T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */] extends StObject {
    
    /**
      * If `true`, the portion of the selected suggestion that has not been typed by the user,
      * known as the completion string, appears inline after the input cursor in the textbox.
      * The inline completion string is visually highlighted and has a selected state.
      * @default false
      */
    var autoComplete: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, the first option is automatically highlighted.
      * @default false
      */
    var autoHighlight: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, the selected option becomes the value of the input
      * when the Autocomplete loses focus unless the user chooses
      * a different option or changes the character string in the input.
      * @default false
      */
    var autoSelect: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Control if the input should be blurred when an option is selected:
      *
      * - `false` the input is not blurred.
      * - `true` the input is always blurred.
      * - `touch` the input is blurred after a touch event.
      * - `mouse` the input is blurred after a mouse event.
      * @default false
      */
    var blurOnSelect: js.UndefOr[touch | mouse | `true` | `false`] = js.undefined
    
    /**
      * If `true`, the input's text is cleared on blur if no value is selected.
      *
      * Set to `true` if you want to help the user enter a new value.
      * Set to `false` if you want to help the user resume his search.
      * @default !props.freeSolo
      */
    var clearOnBlur: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, clear all values when the user presses escape and the popup is closed.
      * @default false
      */
    var clearOnEscape: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The component name that is using this hook. Used for warnings.
      */
    var componentName: js.UndefOr[String] = js.undefined
    
    /**
      * The default value. Use when the component is not controlled.
      * @default props.multiple ? [] : null
      */
    var defaultValue: js.UndefOr[AutocompleteValue[T, Multiple, DisableClearable, FreeSolo]] = js.undefined
    
    /**
      * If `true`, the input can't be cleared.
      * @default false
      */
    var disableClearable: js.UndefOr[DisableClearable] = js.undefined
    
    /**
      * If `true`, the popup won't close when a value is selected.
      * @default false
      */
    var disableCloseOnSelect: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, the list box in the popup will not wrap focus.
      * @default false
      */
    var disableListWrap: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, will allow focus on disabled items.
      * @default false
      */
    var disabledItemsFocusable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A filter function that determines the options that are eligible.
      *
      * @param {T[]} options The options to render.
      * @param {object} state The state of the component.
      * @returns {T[]}
      */
    var filterOptions: js.UndefOr[
        js.Function2[/* options */ js.Array[T], /* state */ FilterOptionsState[T], js.Array[T]]
      ] = js.undefined
    
    /**
      * If `true`, hide the selected options from the list box.
      * @default false
      */
    var filterSelectedOptions: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, the Autocomplete is free solo, meaning that the user input is not bound to provided options.
      * @default false
      */
    var freeSolo: js.UndefOr[FreeSolo] = js.undefined
    
    /**
      * Used to determine the disabled state for a given option.
      *
      * @param {T} option The option to test.
      * @returns {boolean}
      */
    var getOptionDisabled: js.UndefOr[js.Function1[/* option */ T, Boolean]] = js.undefined
    
    /**
      * Used to determine the string value for a given option.
      * It's used to fill the input (and the list box options if `renderOption` is not provided).
      *
      * @param {T} option
      * @returns {string}
      * @default (option) => option.label ?? option
      */
    var getOptionLabel: js.UndefOr[js.Function1[/* option */ T, String]] = js.undefined
    
    /**
      * If provided, the options will be grouped under the returned string.
      * The groupBy value is also used as the text for group headings when `renderGroup` is not provided.
      *
      * @param {T} options The options to group.
      * @returns {string}
      */
    var groupBy: js.UndefOr[js.Function1[/* option */ T, String]] = js.undefined
    
    /**
      * If `true`, the component handles the "Home" and "End" keys when the popup is open.
      * It should move focus to the first option and last option, respectively.
      * @default !props.freeSolo
      */
    var handleHomeEndKeys: js.UndefOr[Boolean] = js.undefined
    
    /**
      * This prop is used to help implement the accessibility logic.
      * If you don't provide an id it will fall back to a randomly generated one.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * If `true`, the highlight can move to the input.
      * @default false
      */
    var includeInputInList: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The input value.
      */
    var inputValue: js.UndefOr[String] = js.undefined
    
    /**
      * Used to determine if the option represents the given value.
      * Uses strict equality by default.
      * ⚠️ Both arguments need to be handled, an option can only match with one value.
      *
      * @param {T} option The option to test.
      * @param {T} value The value to test against.
      * @returns {boolean}
      */
    var isOptionEqualToValue: js.UndefOr[js.Function2[/* option */ T, /* value */ T, Boolean]] = js.undefined
    
    /**
      * If `true`, `value` must be an array and the menu will support multiple selections.
      * @default false
      */
    var multiple: js.UndefOr[Multiple] = js.undefined
    
    /**
      * Callback fired when the value changes.
      *
      * @param {React.SyntheticEvent} event The event source of the callback.
      * @param {T|T[]} value The new value of the component.
      * @param {string} reason One of "createOption", "selectOption", "removeOption", "blur" or "clear".
      * @param {string} [details]
      */
    var onChange: js.UndefOr[
        js.Function4[
          /* event */ ReactEventFrom[Element], 
          /* value */ AutocompleteValue[T, Multiple, DisableClearable, FreeSolo], 
          /* reason */ AutocompleteChangeReason, 
          /* details */ js.UndefOr[AutocompleteChangeDetails[T]], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Callback fired when the popup requests to be closed.
      * Use in controlled mode (see open).
      *
      * @param {React.SyntheticEvent} event The event source of the callback.
      * @param {string} reason Can be: `"toggleInput"`, `"escape"`, `"selectOption"`, `"removeOption"`, `"blur"`.
      */
    var onClose: js.UndefOr[
        js.Function2[/* event */ ReactEventFrom[Element], /* reason */ AutocompleteCloseReason, Unit]
      ] = js.undefined
    
    /**
      * Callback fired when the highlight option changes.
      *
      * @param {React.SyntheticEvent} event The event source of the callback.
      * @param {T} option The highlighted option.
      * @param {string} reason Can be: `"keyboard"`, `"auto"`, `"mouse"`.
      */
    var onHighlightChange: js.UndefOr[
        js.Function3[
          /* event */ ReactEventFrom[Element], 
          /* option */ T | Null, 
          /* reason */ AutocompleteHighlightChangeReason, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Callback fired when the input value changes.
      *
      * @param {React.SyntheticEvent} event The event source of the callback.
      * @param {string} value The new value of the text input.
      * @param {string} reason Can be: `"input"` (user input), `"reset"` (programmatic change), `"clear"`.
      */
    var onInputChange: js.UndefOr[
        js.Function3[
          /* event */ ReactEventFrom[Element], 
          /* value */ String, 
          /* reason */ AutocompleteInputChangeReason, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Callback fired when the popup requests to be opened.
      * Use in controlled mode (see open).
      *
      * @param {React.SyntheticEvent} event The event source of the callback.
      */
    var onOpen: js.UndefOr[js.Function1[/* event */ ReactEventFrom[Element], Unit]] = js.undefined
    
    /**
      * If `true`, the component is shown.
      */
    var open: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, the popup will open on input focus.
      * @default false
      */
    var openOnFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Array of options.
      */
    var options: js.Array[T]
    
    /**
      * If `true`, the input's text is selected on focus.
      * It helps the user clear the selected value.
      * @default !props.freeSolo
      */
    var selectOnFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The value of the autocomplete.
      *
      * The value must have reference equality with the option in order to be selected.
      * You can customize the equality behavior with the `isOptionEqualToValue` prop.
      */
    var value: js.UndefOr[AutocompleteValue[T, Multiple, DisableClearable, FreeSolo]] = js.undefined
  }
  object UseAutocompleteProps {
    
    inline def apply[T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */](options: js.Array[T]): UseAutocompleteProps[T, Multiple, DisableClearable, FreeSolo] = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[UseAutocompleteProps[T, Multiple, DisableClearable, FreeSolo]]
    }
    
    extension [Self <: UseAutocompleteProps[?, ?, ?, ?], T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */](x: Self & (UseAutocompleteProps[T, Multiple, DisableClearable, FreeSolo])) {
      
      inline def setAutoComplete(value: Boolean): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      inline def setAutoHighlight(value: Boolean): Self = StObject.set(x, "autoHighlight", value.asInstanceOf[js.Any])
      
      inline def setAutoHighlightUndefined: Self = StObject.set(x, "autoHighlight", js.undefined)
      
      inline def setAutoSelect(value: Boolean): Self = StObject.set(x, "autoSelect", value.asInstanceOf[js.Any])
      
      inline def setAutoSelectUndefined: Self = StObject.set(x, "autoSelect", js.undefined)
      
      inline def setBlurOnSelect(value: touch | mouse | `true` | `false`): Self = StObject.set(x, "blurOnSelect", value.asInstanceOf[js.Any])
      
      inline def setBlurOnSelectUndefined: Self = StObject.set(x, "blurOnSelect", js.undefined)
      
      inline def setClearOnBlur(value: Boolean): Self = StObject.set(x, "clearOnBlur", value.asInstanceOf[js.Any])
      
      inline def setClearOnBlurUndefined: Self = StObject.set(x, "clearOnBlur", js.undefined)
      
      inline def setClearOnEscape(value: Boolean): Self = StObject.set(x, "clearOnEscape", value.asInstanceOf[js.Any])
      
      inline def setClearOnEscapeUndefined: Self = StObject.set(x, "clearOnEscape", js.undefined)
      
      inline def setComponentName(value: String): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
      
      inline def setComponentNameUndefined: Self = StObject.set(x, "componentName", js.undefined)
      
      inline def setDefaultValue(value: AutocompleteValue[T, Multiple, DisableClearable, FreeSolo]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: (T | AutocompleteFreeSoloValueMapping[FreeSolo])*): Self = StObject.set(x, "defaultValue", js.Array(value*))
      
      inline def setDisableClearable(value: DisableClearable): Self = StObject.set(x, "disableClearable", value.asInstanceOf[js.Any])
      
      inline def setDisableClearableUndefined: Self = StObject.set(x, "disableClearable", js.undefined)
      
      inline def setDisableCloseOnSelect(value: Boolean): Self = StObject.set(x, "disableCloseOnSelect", value.asInstanceOf[js.Any])
      
      inline def setDisableCloseOnSelectUndefined: Self = StObject.set(x, "disableCloseOnSelect", js.undefined)
      
      inline def setDisableListWrap(value: Boolean): Self = StObject.set(x, "disableListWrap", value.asInstanceOf[js.Any])
      
      inline def setDisableListWrapUndefined: Self = StObject.set(x, "disableListWrap", js.undefined)
      
      inline def setDisabledItemsFocusable(value: Boolean): Self = StObject.set(x, "disabledItemsFocusable", value.asInstanceOf[js.Any])
      
      inline def setDisabledItemsFocusableUndefined: Self = StObject.set(x, "disabledItemsFocusable", js.undefined)
      
      inline def setFilterOptions(value: (/* options */ js.Array[T], /* state */ FilterOptionsState[T]) => js.Array[T]): Self = StObject.set(x, "filterOptions", js.Any.fromFunction2(value))
      
      inline def setFilterOptionsUndefined: Self = StObject.set(x, "filterOptions", js.undefined)
      
      inline def setFilterSelectedOptions(value: Boolean): Self = StObject.set(x, "filterSelectedOptions", value.asInstanceOf[js.Any])
      
      inline def setFilterSelectedOptionsUndefined: Self = StObject.set(x, "filterSelectedOptions", js.undefined)
      
      inline def setFreeSolo(value: FreeSolo): Self = StObject.set(x, "freeSolo", value.asInstanceOf[js.Any])
      
      inline def setFreeSoloUndefined: Self = StObject.set(x, "freeSolo", js.undefined)
      
      inline def setGetOptionDisabled(value: /* option */ T => Boolean): Self = StObject.set(x, "getOptionDisabled", js.Any.fromFunction1(value))
      
      inline def setGetOptionDisabledUndefined: Self = StObject.set(x, "getOptionDisabled", js.undefined)
      
      inline def setGetOptionLabel(value: /* option */ T => String): Self = StObject.set(x, "getOptionLabel", js.Any.fromFunction1(value))
      
      inline def setGetOptionLabelUndefined: Self = StObject.set(x, "getOptionLabel", js.undefined)
      
      inline def setGroupBy(value: /* option */ T => String): Self = StObject.set(x, "groupBy", js.Any.fromFunction1(value))
      
      inline def setGroupByUndefined: Self = StObject.set(x, "groupBy", js.undefined)
      
      inline def setHandleHomeEndKeys(value: Boolean): Self = StObject.set(x, "handleHomeEndKeys", value.asInstanceOf[js.Any])
      
      inline def setHandleHomeEndKeysUndefined: Self = StObject.set(x, "handleHomeEndKeys", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIncludeInputInList(value: Boolean): Self = StObject.set(x, "includeInputInList", value.asInstanceOf[js.Any])
      
      inline def setIncludeInputInListUndefined: Self = StObject.set(x, "includeInputInList", js.undefined)
      
      inline def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
      
      inline def setInputValueUndefined: Self = StObject.set(x, "inputValue", js.undefined)
      
      inline def setIsOptionEqualToValue(value: (/* option */ T, /* value */ T) => Boolean): Self = StObject.set(x, "isOptionEqualToValue", js.Any.fromFunction2(value))
      
      inline def setIsOptionEqualToValueUndefined: Self = StObject.set(x, "isOptionEqualToValue", js.undefined)
      
      inline def setMultiple(value: Multiple): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setOnChange(
        value: (/* event */ ReactEventFrom[Element], /* value */ AutocompleteValue[T, Multiple, DisableClearable, FreeSolo], /* reason */ AutocompleteChangeReason, /* details */ js.UndefOr[AutocompleteChangeDetails[T]]) => Callback
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction4((t0: /* event */ ReactEventFrom[Element], t1: /* value */ AutocompleteValue[T, Multiple, DisableClearable, FreeSolo], t2: /* reason */ AutocompleteChangeReason, t3: /* details */ js.UndefOr[AutocompleteChangeDetails[T]]) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClose(value: (/* event */ ReactEventFrom[Element], /* reason */ AutocompleteCloseReason) => Callback): Self = StObject.set(x, "onClose", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[Element], t1: /* reason */ AutocompleteCloseReason) => (value(t0, t1)).runNow()))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnHighlightChange(
        value: (/* event */ ReactEventFrom[Element], /* option */ T | Null, /* reason */ AutocompleteHighlightChangeReason) => Callback
      ): Self = StObject.set(x, "onHighlightChange", js.Any.fromFunction3((t0: /* event */ ReactEventFrom[Element], t1: /* option */ T | Null, t2: /* reason */ AutocompleteHighlightChangeReason) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnHighlightChangeUndefined: Self = StObject.set(x, "onHighlightChange", js.undefined)
      
      inline def setOnInputChange(
        value: (/* event */ ReactEventFrom[Element], /* value */ String, /* reason */ AutocompleteInputChangeReason) => Callback
      ): Self = StObject.set(x, "onInputChange", js.Any.fromFunction3((t0: /* event */ ReactEventFrom[Element], t1: /* value */ String, t2: /* reason */ AutocompleteInputChangeReason) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnInputChangeUndefined: Self = StObject.set(x, "onInputChange", js.undefined)
      
      inline def setOnOpen(value: /* event */ ReactEventFrom[Element] => Callback): Self = StObject.set(x, "onOpen", js.Any.fromFunction1((t0: /* event */ ReactEventFrom[Element]) => value(t0).runNow()))
      
      inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenOnFocus(value: Boolean): Self = StObject.set(x, "openOnFocus", value.asInstanceOf[js.Any])
      
      inline def setOpenOnFocusUndefined: Self = StObject.set(x, "openOnFocus", js.undefined)
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setOptions(value: js.Array[T]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: T*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setSelectOnFocus(value: Boolean): Self = StObject.set(x, "selectOnFocus", value.asInstanceOf[js.Any])
      
      inline def setSelectOnFocusUndefined: Self = StObject.set(x, "selectOnFocus", js.undefined)
      
      inline def setValue(value: AutocompleteValue[T, Multiple, DisableClearable, FreeSolo]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: (T | AutocompleteFreeSoloValueMapping[FreeSolo])*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
}
