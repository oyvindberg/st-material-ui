package com.olvind.mui.muiBase

import com.olvind.mui.muiBase.anon.Datatagindex
import com.olvind.mui.muiBase.anon.IndexNumber
import org.scalajs.dom.Element
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autocompleteUnstyledUseAutocompleteMod {
  
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
  
  object AutocompleteChangeReason {
    
    inline def blur: "blur" = "blur".asInstanceOf["blur"]
    
    inline def clear: "clear" = "clear".asInstanceOf["clear"]
    
    inline def createOption: "createOption" = "createOption".asInstanceOf["createOption"]
    
    inline def removeOption: "removeOption" = "removeOption".asInstanceOf["removeOption"]
    
    inline def selectOption: "selectOption" = "selectOption".asInstanceOf["selectOption"]
  }
  type AutocompleteChangeReason = "createOption" | "selectOption" | "removeOption" | "clear" | "blur"
  
  object AutocompleteCloseReason {
    
    inline def blur: "blur" = "blur".asInstanceOf["blur"]
    
    inline def createOption: "createOption" = "createOption".asInstanceOf["createOption"]
    
    inline def escape: "escape" = "escape".asInstanceOf["escape"]
    
    inline def removeOption: "removeOption" = "removeOption".asInstanceOf["removeOption"]
    
    inline def selectOption: "selectOption" = "selectOption".asInstanceOf["selectOption"]
    
    inline def toggleInput: "toggleInput" = "toggleInput".asInstanceOf["toggleInput"]
  }
  type AutocompleteCloseReason = "createOption" | "toggleInput" | "escape" | "selectOption" | "removeOption" | "blur"
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    FreeSolo extends true ? string : never
    }}}
    */
  type AutocompleteFreeSoloValueMapping[FreeSolo] = String
  
  type AutocompleteGetTagProps = js.Function1[/* param0 */ IndexNumber, Datatagindex]
  
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
  
  object AutocompleteHighlightChangeReason {
    
    inline def auto: "auto" = "auto".asInstanceOf["auto"]
    
    inline def keyboard: "keyboard" = "keyboard".asInstanceOf["keyboard"]
    
    inline def mouse: "mouse" = "mouse".asInstanceOf["mouse"]
  }
  type AutocompleteHighlightChangeReason = "keyboard" | "mouse" | "auto"
  
  object AutocompleteInputChangeReason {
    
    inline def clear: "clear" = "clear".asInstanceOf["clear"]
    
    inline def input: "input" = "input".asInstanceOf["input"]
    
    inline def reset: "reset" = "reset".asInstanceOf["reset"]
  }
  type AutocompleteInputChangeReason = "input" | "reset" | "clear"
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Multiple extends true ? std.Array<T | @mui/base.@mui/base/AutocompleteUnstyled/useAutocomplete.AutocompleteFreeSoloValueMapping<FreeSolo>> : DisableClearable extends true ? T | @mui/base.@mui/base/AutocompleteUnstyled/useAutocomplete.AutocompleteFreeSoloValueMapping<FreeSolo> : T | null | @mui/base.@mui/base/AutocompleteUnstyled/useAutocomplete.AutocompleteFreeSoloValueMapping<FreeSolo>
    }}}
    */
  type AutocompleteValue[T, Multiple, DisableClearable, FreeSolo] = js.Array[T | AutocompleteFreeSoloValueMapping[FreeSolo]]
  
  trait CreateFilterOptionsConfig[T] extends StObject {
    
    var ignoreAccents: js.UndefOr[Boolean] = js.undefined
    
    var ignoreCase: js.UndefOr[Boolean] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var matchFrom: js.UndefOr["any" | "start"] = js.undefined
    
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
      
      inline def setMatchFrom(value: "any" | "start"): Self = StObject.set(x, "matchFrom", value.asInstanceOf[js.Any])
      
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
    var blurOnSelect: js.UndefOr["touch" | "mouse" | true | false] = js.undefined
    
    /**
      * If `true`, the input's text is cleared on blur if no value is selected.
      *
      * Set to `true` if you want to help the user enter a new value.
      * Set to `false` if you want to help the user resume their search.
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
      * If `true`, the component is disabled.
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, will allow focus on disabled items.
      * @default false
      */
    var disabledItemsFocusable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A function that determines the filtered options to be rendered on search.
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
      * If used in free solo mode, it must accept both the type of the options and a string.
      *
      * @param {T} option
      * @returns {string}
      * @default (option) => option.label ?? option
      */
    var getOptionLabel: js.UndefOr[
        js.Function1[/* option */ T | AutocompleteFreeSoloValueMapping[FreeSolo], String]
      ] = js.undefined
    
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
          /* event */ SyntheticEvent[Event, Element], 
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
        js.Function2[
          /* event */ SyntheticEvent[Event, Element], 
          /* reason */ AutocompleteCloseReason, 
          Unit
        ]
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
          /* event */ SyntheticEvent[Event, Element], 
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
          /* event */ SyntheticEvent[Event, Element], 
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
    var onOpen: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, Element], Unit]] = js.undefined
    
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
      * If `true`, the component becomes readonly. It is also supported for multiple tags where the tag cannot be deleted.
      * @default false
      */
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, the input's text is selected on focus.
      * It helps the user clear the selected value.
      * @default !props.freeSolo
      */
    var selectOnFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @internal The prefix of the state class name, temporary for Joy UI
      * @default 'Mui'
      */
    var unstable_classNamePrefix: js.UndefOr[String] = js.undefined
    
    /**
      * @internal
      * Temporary for Joy UI because the parent listbox is the document object
      * TODO v6: Normalize the logic and remove this param.
      */
    var unstable_isActiveElementInListbox: js.UndefOr[js.Function1[/* listbox */ ReactRef[HTMLElement], Boolean]] = js.undefined
    
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
      
      inline def setBlurOnSelect(value: "touch" | "mouse" | true | false): Self = StObject.set(x, "blurOnSelect", value.asInstanceOf[js.Any])
      
      inline def setBlurOnSelectUndefined: Self = StObject.set(x, "blurOnSelect", js.undefined)
      
      inline def setClearOnBlur(value: Boolean): Self = StObject.set(x, "clearOnBlur", value.asInstanceOf[js.Any])
      
      inline def setClearOnBlurUndefined: Self = StObject.set(x, "clearOnBlur", js.undefined)
      
      inline def setClearOnEscape(value: Boolean): Self = StObject.set(x, "clearOnEscape", value.asInstanceOf[js.Any])
      
      inline def setClearOnEscapeUndefined: Self = StObject.set(x, "clearOnEscape", js.undefined)
      
      inline def setComponentName(value: String): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
      
      inline def setComponentNameUndefined: Self = StObject.set(x, "componentName", js.undefined)
      
      inline def setDefaultValue(value: AutocompleteValue[T, Multiple, DisableClearable, FreeSolo]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: (T | AutocompleteFreeSoloValueMapping[FreeSolo])*): Self = StObject.set(x, "defaultValue", js.Array(value*))
      
      inline def setDisableClearable(value: DisableClearable): Self = StObject.set(x, "disableClearable", value.asInstanceOf[js.Any])
      
      inline def setDisableClearableUndefined: Self = StObject.set(x, "disableClearable", js.undefined)
      
      inline def setDisableCloseOnSelect(value: Boolean): Self = StObject.set(x, "disableCloseOnSelect", value.asInstanceOf[js.Any])
      
      inline def setDisableCloseOnSelectUndefined: Self = StObject.set(x, "disableCloseOnSelect", js.undefined)
      
      inline def setDisableListWrap(value: Boolean): Self = StObject.set(x, "disableListWrap", value.asInstanceOf[js.Any])
      
      inline def setDisableListWrapUndefined: Self = StObject.set(x, "disableListWrap", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledItemsFocusable(value: Boolean): Self = StObject.set(x, "disabledItemsFocusable", value.asInstanceOf[js.Any])
      
      inline def setDisabledItemsFocusableUndefined: Self = StObject.set(x, "disabledItemsFocusable", js.undefined)
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFilterOptions(value: (/* options */ js.Array[T], /* state */ FilterOptionsState[T]) => js.Array[T]): Self = StObject.set(x, "filterOptions", js.Any.fromFunction2(value))
      
      inline def setFilterOptionsUndefined: Self = StObject.set(x, "filterOptions", js.undefined)
      
      inline def setFilterSelectedOptions(value: Boolean): Self = StObject.set(x, "filterSelectedOptions", value.asInstanceOf[js.Any])
      
      inline def setFilterSelectedOptionsUndefined: Self = StObject.set(x, "filterSelectedOptions", js.undefined)
      
      inline def setFreeSolo(value: FreeSolo): Self = StObject.set(x, "freeSolo", value.asInstanceOf[js.Any])
      
      inline def setFreeSoloUndefined: Self = StObject.set(x, "freeSolo", js.undefined)
      
      inline def setGetOptionDisabled(value: /* option */ T => Boolean): Self = StObject.set(x, "getOptionDisabled", js.Any.fromFunction1(value))
      
      inline def setGetOptionDisabledUndefined: Self = StObject.set(x, "getOptionDisabled", js.undefined)
      
      inline def setGetOptionLabel(value: /* option */ T | AutocompleteFreeSoloValueMapping[FreeSolo] => String): Self = StObject.set(x, "getOptionLabel", js.Any.fromFunction1(value))
      
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
        value: (/* event */ SyntheticEvent[Event, Element], /* value */ AutocompleteValue[T, Multiple, DisableClearable, FreeSolo], /* reason */ AutocompleteChangeReason, /* details */ js.UndefOr[AutocompleteChangeDetails[T]]) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction4(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClose(value: (/* event */ SyntheticEvent[Event, Element], /* reason */ AutocompleteCloseReason) => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction2(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnHighlightChange(
        value: (/* event */ SyntheticEvent[Event, Element], /* option */ T | Null, /* reason */ AutocompleteHighlightChangeReason) => Unit
      ): Self = StObject.set(x, "onHighlightChange", js.Any.fromFunction3(value))
      
      inline def setOnHighlightChangeUndefined: Self = StObject.set(x, "onHighlightChange", js.undefined)
      
      inline def setOnInputChange(
        value: (/* event */ SyntheticEvent[Event, Element], /* value */ String, /* reason */ AutocompleteInputChangeReason) => Unit
      ): Self = StObject.set(x, "onInputChange", js.Any.fromFunction3(value))
      
      inline def setOnInputChangeUndefined: Self = StObject.set(x, "onInputChange", js.undefined)
      
      inline def setOnOpen(value: /* event */ SyntheticEvent[Event, Element] => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction1(value))
      
      inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenOnFocus(value: Boolean): Self = StObject.set(x, "openOnFocus", value.asInstanceOf[js.Any])
      
      inline def setOpenOnFocusUndefined: Self = StObject.set(x, "openOnFocus", js.undefined)
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setOptions(value: js.Array[T]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: T*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setSelectOnFocus(value: Boolean): Self = StObject.set(x, "selectOnFocus", value.asInstanceOf[js.Any])
      
      inline def setSelectOnFocusUndefined: Self = StObject.set(x, "selectOnFocus", js.undefined)
      
      inline def setUnstable_classNamePrefix(value: String): Self = StObject.set(x, "unstable_classNamePrefix", value.asInstanceOf[js.Any])
      
      inline def setUnstable_classNamePrefixUndefined: Self = StObject.set(x, "unstable_classNamePrefix", js.undefined)
      
      inline def setUnstable_isActiveElementInListbox(value: /* listbox */ ReactRef[HTMLElement] => Boolean): Self = StObject.set(x, "unstable_isActiveElementInListbox", js.Any.fromFunction1(value))
      
      inline def setUnstable_isActiveElementInListboxUndefined: Self = StObject.set(x, "unstable_isActiveElementInListbox", js.undefined)
      
      inline def setValue(value: AutocompleteValue[T, Multiple, DisableClearable, FreeSolo]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: (T | AutocompleteFreeSoloValueMapping[FreeSolo])*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
}
