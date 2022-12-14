package com.olvind.mui.muiJoy

import com.olvind.mui.muiBase.useAutocompleteUseAutocompleteMod.AutocompleteChangeDetails
import com.olvind.mui.muiBase.useAutocompleteUseAutocompleteMod.AutocompleteChangeReason
import com.olvind.mui.muiBase.useAutocompleteUseAutocompleteMod.AutocompleteCloseReason
import com.olvind.mui.muiBase.useAutocompleteUseAutocompleteMod.AutocompleteFreeSoloValueMapping
import com.olvind.mui.muiBase.useAutocompleteUseAutocompleteMod.AutocompleteHighlightChangeReason
import com.olvind.mui.muiBase.useAutocompleteUseAutocompleteMod.AutocompleteInputChangeReason
import com.olvind.mui.muiBase.useAutocompleteUseAutocompleteMod.AutocompleteValue
import com.olvind.mui.muiBase.useAutocompleteUseAutocompleteMod.FilterOptionsState
import com.olvind.mui.muiBase.useAutocompleteUseAutocompleteMod.UseAutocompleteProps
import com.olvind.mui.muiJoy.anon.ClearIndicator
import com.olvind.mui.muiJoy.anon.Datatagindex
import com.olvind.mui.muiJoy.anon.Index
import com.olvind.mui.muiJoy.anon.Input
import com.olvind.mui.muiJoy.anon.KeyboardEventHTMLDivElement
import com.olvind.mui.muiJoy.anon.OmitHTMLAttributesHTMLLIElementcolor
import com.olvind.mui.muiJoy.anon.PartialAutocompleteSlots
import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.ColorPaletteProp
import com.olvind.mui.muiJoy.stylesTypesThemeMod.SxProps
import com.olvind.mui.muiJoy.stylesTypesThemeMod.Theme
import com.olvind.mui.muiJoy.stylesTypesVariantsMod.VariantProp
import com.olvind.mui.muiJoy.utilsTypesMod.CreateSlotsAndSlotProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import com.olvind.mui.muiTypes.mod.OverridableStringUnion
import com.olvind.mui.react.anon.Html
import com.olvind.mui.react.mod.AnimationEventHandler
import com.olvind.mui.react.mod.AriaRole
import com.olvind.mui.react.mod.Booleanish
import com.olvind.mui.react.mod.CSSProperties
import com.olvind.mui.react.mod.ClipboardEventHandler
import com.olvind.mui.react.mod.CompositionEventHandler
import com.olvind.mui.react.mod.DragEventHandler
import com.olvind.mui.react.mod.FocusEventHandler
import com.olvind.mui.react.mod.FormEventHandler
import com.olvind.mui.react.mod.KeyboardEventHandler
import com.olvind.mui.react.mod.MouseEventHandler
import com.olvind.mui.react.mod.PointerEventHandler
import com.olvind.mui.react.mod.ReactEventHandler
import com.olvind.mui.react.mod.TouchEventHandler
import com.olvind.mui.react.mod.TransitionEventHandler
import com.olvind.mui.react.mod.UIEventHandler
import com.olvind.mui.react.mod.WheelEventHandler
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactAnimationEventFrom
import japgolly.scalajs.react.ReactClipboardEventFrom
import japgolly.scalajs.react.ReactCompositionEventFrom
import japgolly.scalajs.react.ReactDragEventFrom
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactPointerEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import japgolly.scalajs.react.ReactTransitionEventFrom
import japgolly.scalajs.react.ReactUIEventFrom
import japgolly.scalajs.react.ReactWheelEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefHandle
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autocompleteAutocompletePropsMod {
  
  trait AutocompleteOwnProps[T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */]
    extends StObject
       with UseAutocompleteProps[T, Multiple, DisableClearable, FreeSolo]
       with CreateSlotsAndSlotProps[AutocompleteSlots, ClearIndicator] {
    
    /**
      * If `true`, the `input` element is focused during the first mount.
      */
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The icon to display in place of the default clear icon.
      * @default <ClearIcon fontSize="md" />
      */
    var clearIcon: js.UndefOr[Node] = js.undefined
    
    /**
      * Override the default text for the *clear* icon button.
      *
      * For localization purposes, you can use the provided [translations](/material-ui/guides/localization/).
      * @default 'Clear'
      */
    var clearText: js.UndefOr[String] = js.undefined
    
    /**
      * Override the default text for the *close popup* icon button.
      *
      * For localization purposes, you can use the provided [translations](/material-ui/guides/localization/).
      * @default 'Close'
      */
    var closeText: js.UndefOr[String] = js.undefined
    
    /**
      * The color of the component. It supports those theme colors that make sense for this component.
      * @default 'neutral'
      */
    var color: js.UndefOr[OverridableStringUnion[ColorPaletteProp, AutocompletePropsColorOverrides]] = js.undefined
    
    /**
      * Trailing adornment for this input.
      */
    var endDecorator: js.UndefOr[Node] = js.undefined
    
    /**
      * If `true`, the `input` will indicate an error.
      * The prop defaults to the value (`false`) inherited from the parent FormControl component.
      * @default false
      */
    var error: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Force the visibility display of the popup icon.
      * @default 'auto'
      */
    var forcePopupIcon: js.UndefOr[true | false | "auto"] = js.undefined
    
    /**
      * The label to display when the tags are truncated (`limitTags`).
      *
      * @param {string | number} more The number of truncated tags.
      * @returns {ReactNode}
      * @default (more: string | number) => `+${more}`
      */
    var getLimitTagsText: js.UndefOr[js.Function1[/* more */ String | Double, Node]] = js.undefined
    
    /**
      * The maximum number of tags that will be visible when not focused.
      * Set `-1` to disable the limit.
      * @default -1
      */
    var limitTags: js.UndefOr[Double] = js.undefined
    
    /**
      * If `true`, the component is in a loading state.
      * This shows the `loadingText` in place of suggestions (only if there are no suggestions to show, e.g. `options` are empty).
      * @default false
      */
    var loading: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Text to display when in a loading state.
      *
      * For localization purposes, you can use the provided [translations](/material-ui/guides/localization/).
      * @default 'Loading…'
      */
    var loadingText: js.UndefOr[Node] = js.undefined
    
    /**
      * Name attribute of the `input` element.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Text to display when there are no options.
      *
      * For localization purposes, you can use the provided [translations](/material-ui/guides/localization/).
      * @default 'No options'
      */
    var noOptionsText: js.UndefOr[Node] = js.undefined
    
    /**
      * Override the default text for the *open popup* icon button.
      *
      * For localization purposes, you can use the provided [translations](/material-ui/guides/localization/).
      * @default 'Open'
      */
    var openText: js.UndefOr[String] = js.undefined
    
    /**
      * The input placeholder
      */
    var placeholder: js.UndefOr[String] = js.undefined
    
    /**
      * The icon to display in place of the default popup icon.
      * @default <ArrowDropDownIcon />
      */
    var popupIcon: js.UndefOr[Node] = js.undefined
    
    /**
      * Render the group.
      *
      * @param {AutocompleteRenderGroupParams} params The group to render.
      * @returns {ReactNode}
      */
    var renderGroup: js.UndefOr[js.Function1[/* params */ AutocompleteRenderGroupParams, Node]] = js.undefined
    
    /**
      * Render the option, use `getOptionLabel` by default.
      *
      * @param {object} props The props to apply on the li element.
      * @param {T} option The option to render.
      * @param {object} state The state of the component.
      * @returns {ReactNode}
      */
    var renderOption: js.UndefOr[
        js.Function3[
          /* props */ OmitHTMLAttributesHTMLLIElementcolor, 
          /* option */ T, 
          /* state */ AutocompleteRenderOptionState, 
          Node
        ]
      ] = js.undefined
    
    /**
      * Render the selected value.
      *
      * @param {T[]} value The `value` provided to the component.
      * @param {function} getTagProps A tag props getter.
      * @param {object} ownerState The state of the Autocomplete component.
      * @returns {ReactNode}
      */
    var renderTags: js.UndefOr[
        js.Function3[
          /* value */ js.Array[T], 
          /* getTagProps */ AutocompleteRenderGetTagProps, 
          /* ownerState */ AutocompleteOwnerState[T, Multiple, DisableClearable, FreeSolo], 
          Node
        ]
      ] = js.undefined
    
    /**
      * If `true`, the `input` element is required.
      * The prop defaults to the value (`false`) inherited from the parent FormControl component.
      */
    var required: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The size of the component.
      * @default 'md'
      */
    var size: js.UndefOr[OverridableStringUnion["sm" | "md" | "lg", AutocompletePropsSizeOverrides]] = js.undefined
    
    /**
      * Leading adornment for this input.
      */
    var startDecorator: js.UndefOr[Node] = js.undefined
    
    /**
      * The system prop that allows defining system overrides as well as additional CSS styles.
      */
    var sx: js.UndefOr[SxProps] = js.undefined
    
    /**
      * The [global variant](https://mui.com/joy-ui/main-features/global-variants/) to use.
      * @default 'outlined'
      */
    var variant: js.UndefOr[OverridableStringUnion[VariantProp, AutocompletePropsVariantOverrides]] = js.undefined
  }
  object AutocompleteOwnProps {
    
    inline def apply[T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */](options: js.Array[T]): AutocompleteOwnProps[T, Multiple, DisableClearable, FreeSolo] = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutocompleteOwnProps[T, Multiple, DisableClearable, FreeSolo]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AutocompleteOwnProps[?, ?, ?, ?], T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */] (val x: Self & (AutocompleteOwnProps[T, Multiple, DisableClearable, FreeSolo])) extends AnyVal {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setClearIcon(value: VdomNode): Self = StObject.set(x, "clearIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setClearIconNull: Self = StObject.set(x, "clearIcon", null)
      
      inline def setClearIconUndefined: Self = StObject.set(x, "clearIcon", js.undefined)
      
      inline def setClearIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "clearIcon", js.Array(value*))
      
      inline def setClearIconVdomElement(value: VdomElement): Self = StObject.set(x, "clearIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClearText(value: String): Self = StObject.set(x, "clearText", value.asInstanceOf[js.Any])
      
      inline def setClearTextUndefined: Self = StObject.set(x, "clearText", js.undefined)
      
      inline def setCloseText(value: String): Self = StObject.set(x, "closeText", value.asInstanceOf[js.Any])
      
      inline def setCloseTextUndefined: Self = StObject.set(x, "closeText", js.undefined)
      
      inline def setColor(value: OverridableStringUnion[ColorPaletteProp, AutocompletePropsColorOverrides]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setEndDecorator(value: VdomNode): Self = StObject.set(x, "endDecorator", value.rawNode.asInstanceOf[js.Any])
      
      inline def setEndDecoratorNull: Self = StObject.set(x, "endDecorator", null)
      
      inline def setEndDecoratorUndefined: Self = StObject.set(x, "endDecorator", js.undefined)
      
      inline def setEndDecoratorVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "endDecorator", js.Array(value*))
      
      inline def setEndDecoratorVdomElement(value: VdomElement): Self = StObject.set(x, "endDecorator", value.rawElement.asInstanceOf[js.Any])
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setForcePopupIcon(value: true | false | "auto"): Self = StObject.set(x, "forcePopupIcon", value.asInstanceOf[js.Any])
      
      inline def setForcePopupIconUndefined: Self = StObject.set(x, "forcePopupIcon", js.undefined)
      
      inline def setGetLimitTagsText(value: /* more */ String | Double => Node): Self = StObject.set(x, "getLimitTagsText", js.Any.fromFunction1(value))
      
      inline def setGetLimitTagsTextUndefined: Self = StObject.set(x, "getLimitTagsText", js.undefined)
      
      inline def setLimitTags(value: Double): Self = StObject.set(x, "limitTags", value.asInstanceOf[js.Any])
      
      inline def setLimitTagsUndefined: Self = StObject.set(x, "limitTags", js.undefined)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingText(value: VdomNode): Self = StObject.set(x, "loadingText", value.rawNode.asInstanceOf[js.Any])
      
      inline def setLoadingTextNull: Self = StObject.set(x, "loadingText", null)
      
      inline def setLoadingTextUndefined: Self = StObject.set(x, "loadingText", js.undefined)
      
      inline def setLoadingTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "loadingText", js.Array(value*))
      
      inline def setLoadingTextVdomElement(value: VdomElement): Self = StObject.set(x, "loadingText", value.rawElement.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNoOptionsText(value: VdomNode): Self = StObject.set(x, "noOptionsText", value.rawNode.asInstanceOf[js.Any])
      
      inline def setNoOptionsTextNull: Self = StObject.set(x, "noOptionsText", null)
      
      inline def setNoOptionsTextUndefined: Self = StObject.set(x, "noOptionsText", js.undefined)
      
      inline def setNoOptionsTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "noOptionsText", js.Array(value*))
      
      inline def setNoOptionsTextVdomElement(value: VdomElement): Self = StObject.set(x, "noOptionsText", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOpenText(value: String): Self = StObject.set(x, "openText", value.asInstanceOf[js.Any])
      
      inline def setOpenTextUndefined: Self = StObject.set(x, "openText", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPopupIcon(value: VdomNode): Self = StObject.set(x, "popupIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setPopupIconNull: Self = StObject.set(x, "popupIcon", null)
      
      inline def setPopupIconUndefined: Self = StObject.set(x, "popupIcon", js.undefined)
      
      inline def setPopupIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "popupIcon", js.Array(value*))
      
      inline def setPopupIconVdomElement(value: VdomElement): Self = StObject.set(x, "popupIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setRenderGroup(value: /* params */ AutocompleteRenderGroupParams => Node): Self = StObject.set(x, "renderGroup", js.Any.fromFunction1(value))
      
      inline def setRenderGroupUndefined: Self = StObject.set(x, "renderGroup", js.undefined)
      
      inline def setRenderOption(
        value: (/* props */ OmitHTMLAttributesHTMLLIElementcolor, /* option */ T, /* state */ AutocompleteRenderOptionState) => Node
      ): Self = StObject.set(x, "renderOption", js.Any.fromFunction3(value))
      
      inline def setRenderOptionUndefined: Self = StObject.set(x, "renderOption", js.undefined)
      
      inline def setRenderTags(
        value: (/* value */ js.Array[T], /* getTagProps */ AutocompleteRenderGetTagProps, /* ownerState */ AutocompleteOwnerState[T, Multiple, DisableClearable, FreeSolo]) => Node
      ): Self = StObject.set(x, "renderTags", js.Any.fromFunction3(value))
      
      inline def setRenderTagsUndefined: Self = StObject.set(x, "renderTags", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setSize(value: OverridableStringUnion["sm" | "md" | "lg", AutocompletePropsSizeOverrides]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStartDecorator(value: VdomNode): Self = StObject.set(x, "startDecorator", value.rawNode.asInstanceOf[js.Any])
      
      inline def setStartDecoratorNull: Self = StObject.set(x, "startDecorator", null)
      
      inline def setStartDecoratorUndefined: Self = StObject.set(x, "startDecorator", js.undefined)
      
      inline def setStartDecoratorVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "startDecorator", js.Array(value*))
      
      inline def setStartDecoratorVdomElement(value: VdomElement): Self = StObject.set(x, "startDecorator", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSx(value: SxProps): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
      
      inline def setSxFunction1(value: Theme => SystemStyleObject[Theme]): Self = StObject.set(x, "sx", js.Any.fromFunction1(value))
      
      inline def setSxNull: Self = StObject.set(x, "sx", null)
      
      inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
      
      inline def setSxVarargs(value: (Boolean | SystemStyleObject[Theme] | (js.Function1[Theme, SystemStyleObject[Theme]]))*): Self = StObject.set(x, "sx", js.Array(value*))
      
      inline def setVariant(value: OverridableStringUnion[VariantProp, AutocompletePropsVariantOverrides]): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped std.Omit<@mui/joy.@mui/joy/Autocomplete/AutocompleteProps.AutocompleteOwnProps<T, Multiple, DisableClearable, FreeSolo>, 'color'> & @mui/joy.anon.61<@mui/joy.@mui/joy/Autocomplete/AutocompleteProps.AutocompleteOwnProps<T, Multiple, DisableClearable, FreeSolo>> extends std.Function ? std.Omit<@mui/joy.@mui/joy/Autocomplete/AutocompleteProps.AutocompleteOwnProps<T, Multiple, DisableClearable, FreeSolo>, 'color'> & @mui/joy.anon.61<@mui/joy.@mui/joy/Autocomplete/AutocompleteProps.AutocompleteOwnProps<T, Multiple, DisableClearable, FreeSolo>> : {[ K in keyof std.Omit<@mui/joy.@mui/joy/Autocomplete/AutocompleteProps.AutocompleteOwnProps<T, Multiple, DisableClearable, FreeSolo>, 'color'> & @mui/joy.anon.61<@mui/joy.@mui/joy/Autocomplete/AutocompleteProps.AutocompleteOwnProps<T, Multiple, DisableClearable, FreeSolo>> ]: std.Omit<@mui/joy.@mui/joy/Autocomplete/AutocompleteProps.AutocompleteOwnProps<T, Multiple, DisableClearable, FreeSolo>, 'color'> & @mui/joy.anon.61<@mui/joy.@mui/joy/Autocomplete/AutocompleteProps.AutocompleteOwnProps<T, Multiple, DisableClearable, FreeSolo>>[K]} */ trait AutocompleteOwnerState[T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */] extends StObject {
    
    var focused: js.UndefOr[Boolean] = js.undefined
    
    var hasClearIcon: js.UndefOr[Boolean] = js.undefined
    
    var hasOptions: js.UndefOr[Boolean] = js.undefined
    
    var hasPopupIcon: js.UndefOr[Boolean] = js.undefined
    
    var inputFocused: js.UndefOr[Boolean] = js.undefined
    
    var popupOpen: js.UndefOr[Boolean] = js.undefined
  }
  object AutocompleteOwnerState {
    
    inline def apply[T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */](): AutocompleteOwnerState[T, Multiple, DisableClearable, FreeSolo] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutocompleteOwnerState[T, Multiple, DisableClearable, FreeSolo]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AutocompleteOwnerState[?, ?, ?, ?], T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */] (val x: Self & (AutocompleteOwnerState[T, Multiple, DisableClearable, FreeSolo])) extends AnyVal {
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
      
      inline def setHasClearIcon(value: Boolean): Self = StObject.set(x, "hasClearIcon", value.asInstanceOf[js.Any])
      
      inline def setHasClearIconUndefined: Self = StObject.set(x, "hasClearIcon", js.undefined)
      
      inline def setHasOptions(value: Boolean): Self = StObject.set(x, "hasOptions", value.asInstanceOf[js.Any])
      
      inline def setHasOptionsUndefined: Self = StObject.set(x, "hasOptions", js.undefined)
      
      inline def setHasPopupIcon(value: Boolean): Self = StObject.set(x, "hasPopupIcon", value.asInstanceOf[js.Any])
      
      inline def setHasPopupIconUndefined: Self = StObject.set(x, "hasPopupIcon", js.undefined)
      
      inline def setInputFocused(value: Boolean): Self = StObject.set(x, "inputFocused", value.asInstanceOf[js.Any])
      
      inline def setInputFocusedUndefined: Self = StObject.set(x, "inputFocused", js.undefined)
      
      inline def setPopupOpen(value: Boolean): Self = StObject.set(x, "popupOpen", value.asInstanceOf[js.Any])
      
      inline def setPopupOpenUndefined: Self = StObject.set(x, "popupOpen", js.undefined)
    }
  }
  
  /* Inlined parent @mui/joy.@mui/joy/Autocomplete/AutocompleteProps.AutocompleteOwnProps<T, Multiple, DisableClearable, FreeSolo> */
  /* Inlined parent std.Omit<react.react.HTMLAttributes<std.HTMLDivElement>, 'defaultValue' | 'onChange' | 'children' | 'color'> */
  trait AutocompleteProps[T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */] extends StObject {
    
    var about: js.UndefOr[String] = js.undefined
    
    var accessKey: js.UndefOr[String] = js.undefined
    
    var `aria-activedescendant`: js.UndefOr[String] = js.undefined
    
    var `aria-atomic`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-autocomplete`: js.UndefOr["none" | "inline" | "list" | "both"] = js.undefined
    
    var `aria-busy`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-checked`: js.UndefOr[Boolean | "mixed"] = js.undefined
    
    var `aria-colcount`: js.UndefOr[Double] = js.undefined
    
    var `aria-colindex`: js.UndefOr[Double] = js.undefined
    
    var `aria-colspan`: js.UndefOr[Double] = js.undefined
    
    var `aria-controls`: js.UndefOr[String] = js.undefined
    
    var `aria-current`: js.UndefOr[Boolean | "page" | "step" | "location" | "date" | "time"] = js.undefined
    
    var `aria-describedby`: js.UndefOr[String] = js.undefined
    
    var `aria-details`: js.UndefOr[String] = js.undefined
    
    var `aria-disabled`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-dropeffect`: js.UndefOr["none" | "copy" | "execute" | "link" | "move" | "popup"] = js.undefined
    
    var `aria-errormessage`: js.UndefOr[String] = js.undefined
    
    var `aria-expanded`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-flowto`: js.UndefOr[String] = js.undefined
    
    var `aria-grabbed`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-haspopup`: js.UndefOr[Boolean | "menu" | "listbox" | "tree" | "grid" | "dialog"] = js.undefined
    
    var `aria-hidden`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-invalid`: js.UndefOr[Boolean | "grammar" | "spelling"] = js.undefined
    
    var `aria-keyshortcuts`: js.UndefOr[String] = js.undefined
    
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    var `aria-labelledby`: js.UndefOr[String] = js.undefined
    
    var `aria-level`: js.UndefOr[Double] = js.undefined
    
    var `aria-live`: js.UndefOr["off" | "assertive" | "polite"] = js.undefined
    
    var `aria-modal`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-multiline`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-multiselectable`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-orientation`: js.UndefOr["horizontal" | "vertical"] = js.undefined
    
    var `aria-owns`: js.UndefOr[String] = js.undefined
    
    var `aria-placeholder`: js.UndefOr[String] = js.undefined
    
    var `aria-posinset`: js.UndefOr[Double] = js.undefined
    
    var `aria-pressed`: js.UndefOr[Boolean | "mixed"] = js.undefined
    
    var `aria-readonly`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-relevant`: js.UndefOr[
        "additions" | ("additions removals") | ("additions text") | "all" | "removals" | ("removals additions") | ("removals text") | "text" | ("text additions") | ("text removals")
      ] = js.undefined
    
    var `aria-required`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-roledescription`: js.UndefOr[String] = js.undefined
    
    var `aria-rowcount`: js.UndefOr[Double] = js.undefined
    
    var `aria-rowindex`: js.UndefOr[Double] = js.undefined
    
    var `aria-rowspan`: js.UndefOr[Double] = js.undefined
    
    var `aria-selected`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-setsize`: js.UndefOr[Double] = js.undefined
    
    var `aria-sort`: js.UndefOr["none" | "ascending" | "descending" | "other"] = js.undefined
    
    var `aria-valuemax`: js.UndefOr[Double] = js.undefined
    
    var `aria-valuemin`: js.UndefOr[Double] = js.undefined
    
    var `aria-valuenow`: js.UndefOr[Double] = js.undefined
    
    var `aria-valuetext`: js.UndefOr[String] = js.undefined
    
    var autoCapitalize: js.UndefOr[String] = js.undefined
    
    /**
      * If `true`, the portion of the selected suggestion that has not been typed by the user,
      * known as the completion string, appears inline after the input cursor in the textbox.
      * The inline completion string is visually highlighted and has a selected state.
      * @default false
      */
    var autoComplete: js.UndefOr[Boolean] = js.undefined
    
    var autoCorrect: js.UndefOr[String] = js.undefined
    
    /**
      * If `true`, the `input` element is focused during the first mount.
      */
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, the first option is automatically highlighted.
      * @default false
      */
    var autoHighlight: js.UndefOr[Boolean] = js.undefined
    
    var autoSave: js.UndefOr[String] = js.undefined
    
    /**
      * If `true`, the selected option becomes the value of the input
      * when the Autocomplete loses focus unless the user chooses
      * a different option or changes the character string in the input.
      *
      * When using `freeSolo` mode, the typed value will be the input value
      * if the Autocomplete loses focus without highlighting an option.
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
    
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * The icon to display in place of the default clear icon.
      * @default <ClearIcon fontSize="md" />
      */
    var clearIcon: js.UndefOr[Node] = js.undefined
    
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
      * Override the default text for the *clear* icon button.
      *
      * For localization purposes, you can use the provided [translations](/material-ui/guides/localization/).
      * @default 'Clear'
      */
    var clearText: js.UndefOr[String] = js.undefined
    
    /**
      * Override the default text for the *close popup* icon button.
      *
      * For localization purposes, you can use the provided [translations](/material-ui/guides/localization/).
      * @default 'Close'
      */
    var closeText: js.UndefOr[String] = js.undefined
    
    /**
      * The color of the component. It supports those theme colors that make sense for this component.
      * @default 'neutral'
      */
    var color: js.UndefOr[OverridableStringUnion[ColorPaletteProp, AutocompletePropsColorOverrides]] = js.undefined
    
    /**
      * The component name that is using this hook. Used for warnings.
      */
    var componentName: js.UndefOr[String] = js.undefined
    
    var content: js.UndefOr[String] = js.undefined
    
    var contentEditable: js.UndefOr[Booleanish | "inherit"] = js.undefined
    
    var contextMenu: js.UndefOr[String] = js.undefined
    
    var dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
    
    var datatype: js.UndefOr[String] = js.undefined
    
    var defaultChecked: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The default value. Use when the component is not controlled.
      * @default props.multiple ? [] : null
      */
    var defaultValue: js.UndefOr[AutocompleteValue[T, Multiple, DisableClearable, FreeSolo]] = js.undefined
    
    var dir: js.UndefOr[String] = js.undefined
    
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
    
    var draggable: js.UndefOr[Booleanish] = js.undefined
    
    /**
      * Trailing adornment for this input.
      */
    var endDecorator: js.UndefOr[Node] = js.undefined
    
    /**
      * If `true`, the `input` will indicate an error.
      * The prop defaults to the value (`false`) inherited from the parent FormControl component.
      * @default false
      */
    var error: js.UndefOr[Boolean] = js.undefined
    
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
      * Force the visibility display of the popup icon.
      * @default 'auto'
      */
    var forcePopupIcon: js.UndefOr[true | false | "auto"] = js.undefined
    
    /**
      * If `true`, the Autocomplete is free solo, meaning that the user input is not bound to provided options.
      * @default false
      */
    var freeSolo: js.UndefOr[FreeSolo] = js.undefined
    
    /**
      * The label to display when the tags are truncated (`limitTags`).
      *
      * @param {string | number} more The number of truncated tags.
      * @returns {ReactNode}
      * @default (more: string | number) => `+${more}`
      */
    var getLimitTagsText: js.UndefOr[js.Function1[/* more */ String | Double, Node]] = js.undefined
    
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
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
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
    
    var inlist: js.UndefOr[Any] = js.undefined
    
    var inputMode: js.UndefOr["none" | "text" | "tel" | "url" | "email" | "numeric" | "decimal" | "search"] = js.undefined
    
    /**
      * The input value.
      */
    var inputValue: js.UndefOr[String] = js.undefined
    
    var is: js.UndefOr[String] = js.undefined
    
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
    
    var itemID: js.UndefOr[String] = js.undefined
    
    var itemProp: js.UndefOr[String] = js.undefined
    
    var itemRef: js.UndefOr[String] = js.undefined
    
    var itemScope: js.UndefOr[Boolean] = js.undefined
    
    var itemType: js.UndefOr[String] = js.undefined
    
    var lang: js.UndefOr[String] = js.undefined
    
    /**
      * The maximum number of tags that will be visible when not focused.
      * Set `-1` to disable the limit.
      * @default -1
      */
    var limitTags: js.UndefOr[Double] = js.undefined
    
    /**
      * If `true`, the component is in a loading state.
      * This shows the `loadingText` in place of suggestions (only if there are no suggestions to show, e.g. `options` are empty).
      * @default false
      */
    var loading: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Text to display when in a loading state.
      *
      * For localization purposes, you can use the provided [translations](/material-ui/guides/localization/).
      * @default 'Loading…'
      */
    var loadingText: js.UndefOr[Node] = js.undefined
    
    /**
      * If `true`, `value` must be an array and the menu will support multiple selections.
      * @default false
      */
    var multiple: js.UndefOr[Multiple] = js.undefined
    
    /**
      * Name attribute of the `input` element.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Text to display when there are no options.
      *
      * For localization purposes, you can use the provided [translations](/material-ui/guides/localization/).
      * @default 'No options'
      */
    var noOptionsText: js.UndefOr[Node] = js.undefined
    
    var nonce: js.UndefOr[String] = js.undefined
    
    var onAbort: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLDivElement]] = js.undefined
    
    var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLDivElement]] = js.undefined
    
    var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLDivElement]] = js.undefined
    
    var onAuxClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onBeforeInput: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.undefined
    
    var onCanPlay: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
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
          /* event */ ReactEventFrom[org.scalajs.dom.Element], 
          /* value */ AutocompleteValue[T, Multiple, DisableClearable, FreeSolo], 
          /* reason */ AutocompleteChangeReason, 
          /* details */ js.UndefOr[AutocompleteChangeDetails[T]], 
          Unit
        ]
      ] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    /**
      * Callback fired when the popup requests to be closed.
      * Use in controlled mode (see open).
      *
      * @param {React.SyntheticEvent} event The event source of the callback.
      * @param {string} reason Can be: `"toggleInput"`, `"escape"`, `"selectOption"`, `"removeOption"`, `"blur"`.
      */
    var onClose: js.UndefOr[
        js.Function2[
          /* event */ ReactEventFrom[org.scalajs.dom.Element], 
          /* reason */ AutocompleteCloseReason, 
          Unit
        ]
      ] = js.undefined
    
    var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.undefined
    
    var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.undefined
    
    var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.undefined
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onCopy: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.undefined
    
    var onCut: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.undefined
    
    var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onDrag: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
    
    var onDragEnd: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
    
    var onDragEnter: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
    
    var onDragExit: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
    
    var onDragLeave: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
    
    var onDragOver: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
    
    var onDragStart: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
    
    var onDrop: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
    
    var onDurationChange: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onEmptied: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onEncrypted: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onEnded: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onError: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.undefined
    
    /**
      * Callback fired when the highlight option changes.
      *
      * @param {React.SyntheticEvent} event The event source of the callback.
      * @param {T} option The highlighted option.
      * @param {string} reason Can be: `"keyboard"`, `"auto"`, `"mouse"`, `"touch"`.
      */
    var onHighlightChange: js.UndefOr[
        js.Function3[
          /* event */ ReactEventFrom[org.scalajs.dom.Element], 
          /* option */ T | Null, 
          /* reason */ AutocompleteHighlightChangeReason, 
          Unit
        ]
      ] = js.undefined
    
    var onInput: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.undefined
    
    /**
      * Callback fired when the input value changes.
      *
      * @param {React.SyntheticEvent} event The event source of the callback.
      * @param {string} value The new value of the text input.
      * @param {string} reason Can be: `"input"` (user input), `"reset"` (programmatic change), `"clear"`.
      */
    var onInputChange: js.UndefOr[
        js.Function3[
          /* event */ ReactEventFrom[org.scalajs.dom.Element], 
          /* value */ String, 
          /* reason */ AutocompleteInputChangeReason, 
          Unit
        ]
      ] = js.undefined
    
    var onInvalid: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.undefined
    
    var onKeyDown: js.UndefOr[js.Function1[/* event */ KeyboardEventHTMLDivElement, Unit]] = js.undefined
    
    var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.undefined
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.undefined
    
    var onLoad: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onLoadStart: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onLoadedData: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseMove: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseOut: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseOver: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseUp: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    /**
      * Callback fired when the popup requests to be opened.
      * Use in controlled mode (see open).
      *
      * @param {React.SyntheticEvent} event The event source of the callback.
      */
    var onOpen: js.UndefOr[js.Function1[/* event */ ReactEventFrom[org.scalajs.dom.Element], Unit]] = js.undefined
    
    var onPaste: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.undefined
    
    var onPause: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onPlay: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onPlaying: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.undefined
    
    var onPointerDown: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.undefined
    
    var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.undefined
    
    var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.undefined
    
    var onPointerMove: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.undefined
    
    var onPointerOut: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.undefined
    
    var onPointerOver: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.undefined
    
    var onPointerUp: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.undefined
    
    var onProgress: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onRateChange: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onReset: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.undefined
    
    var onResize: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onScroll: js.UndefOr[UIEventHandler[HTMLDivElement]] = js.undefined
    
    var onSeeked: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onSeeking: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onSelect: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onStalled: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onSubmit: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.undefined
    
    var onSuspend: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.undefined
    
    var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.undefined
    
    var onTouchMove: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.undefined
    
    var onTouchStart: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.undefined
    
    var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLDivElement]] = js.undefined
    
    var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onWaiting: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onWheel: js.UndefOr[WheelEventHandler[HTMLDivElement]] = js.undefined
    
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
      * Override the default text for the *open popup* icon button.
      *
      * For localization purposes, you can use the provided [translations](/material-ui/guides/localization/).
      * @default 'Open'
      */
    var openText: js.UndefOr[String] = js.undefined
    
    /**
      * Array of options.
      */
    var options: js.Array[T]
    
    /**
      * The input placeholder
      */
    var placeholder: js.UndefOr[String] = js.undefined
    
    /**
      * The icon to display in place of the default popup icon.
      * @default <ArrowDropDownIcon />
      */
    var popupIcon: js.UndefOr[Node] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var property: js.UndefOr[String] = js.undefined
    
    var radioGroup: js.UndefOr[String] = js.undefined
    
    /**
      * If `true`, the component becomes read-only. It is also supported in multiple tags where the tag cannot be deleted.
      * @default false
      */
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var rel: js.UndefOr[String] = js.undefined
    
    /**
      * Render the group.
      *
      * @param {AutocompleteRenderGroupParams} params The group to render.
      * @returns {ReactNode}
      */
    var renderGroup: js.UndefOr[js.Function1[/* params */ AutocompleteRenderGroupParams, Node]] = js.undefined
    
    /**
      * Render the option, use `getOptionLabel` by default.
      *
      * @param {object} props The props to apply on the li element.
      * @param {T} option The option to render.
      * @param {object} state The state of the component.
      * @returns {ReactNode}
      */
    var renderOption: js.UndefOr[
        js.Function3[
          /* props */ OmitHTMLAttributesHTMLLIElementcolor, 
          /* option */ T, 
          /* state */ AutocompleteRenderOptionState, 
          Node
        ]
      ] = js.undefined
    
    /**
      * Render the selected value.
      *
      * @param {T[]} value The `value` provided to the component.
      * @param {function} getTagProps A tag props getter.
      * @param {object} ownerState The state of the Autocomplete component.
      * @returns {ReactNode}
      */
    var renderTags: js.UndefOr[
        js.Function3[
          /* value */ js.Array[T], 
          /* getTagProps */ AutocompleteRenderGetTagProps, 
          /* ownerState */ AutocompleteOwnerState[T, Multiple, DisableClearable, FreeSolo], 
          Node
        ]
      ] = js.undefined
    
    /**
      * If `true`, the `input` element is required.
      * The prop defaults to the value (`false`) inherited from the parent FormControl component.
      */
    var required: js.UndefOr[Boolean] = js.undefined
    
    var resource: js.UndefOr[String] = js.undefined
    
    var results: js.UndefOr[Double] = js.undefined
    
    var rev: js.UndefOr[String] = js.undefined
    
    var role: js.UndefOr[AriaRole] = js.undefined
    
    var security: js.UndefOr[String] = js.undefined
    
    /**
      * If `true`, the input's text is selected on focus.
      * It helps the user clear the selected value.
      * @default !props.freeSolo
      */
    var selectOnFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The size of the component.
      * @default 'md'
      */
    var size: js.UndefOr[OverridableStringUnion["sm" | "md" | "lg", AutocompletePropsSizeOverrides]] = js.undefined
    
    var slot: js.UndefOr[String] = js.undefined
    
    var slotProps: js.UndefOr[Input] = js.undefined
    
    var slots: js.UndefOr[PartialAutocompleteSlots] = js.undefined
    
    var spellCheck: js.UndefOr[Booleanish] = js.undefined
    
    /**
      * Leading adornment for this input.
      */
    var startDecorator: js.UndefOr[Node] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
    
    var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The system prop that allows defining system overrides as well as additional CSS styles.
      */
    var sx: js.UndefOr[SxProps] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var translate: js.UndefOr["yes" | "no"] = js.undefined
    
    /**
      * Type of the `input` element. It should be [a valid HTML5 input type](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input#Form_%3Cinput%3E_types).
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    var typeof: js.UndefOr[String] = js.undefined
    
    var unselectable: js.UndefOr["on" | "off"] = js.undefined
    
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
    var unstable_isActiveElementInListbox: js.UndefOr[js.Function1[/* listbox */ RefHandle[HTMLElement], Boolean]] = js.undefined
    
    /**
      * The value of the autocomplete.
      *
      * The value must have reference equality with the option in order to be selected.
      * You can customize the equality behavior with the `isOptionEqualToValue` prop.
      */
    var value: js.UndefOr[AutocompleteValue[T, Multiple, DisableClearable, FreeSolo]] = js.undefined
    
    /**
      * The [global variant](https://mui.com/joy-ui/main-features/global-variants/) to use.
      * @default 'outlined'
      */
    var variant: js.UndefOr[OverridableStringUnion[VariantProp, AutocompletePropsVariantOverrides]] = js.undefined
    
    var vocab: js.UndefOr[String] = js.undefined
  }
  object AutocompleteProps {
    
    inline def apply[T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */](options: js.Array[T]): AutocompleteProps[T, Multiple, DisableClearable, FreeSolo] = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutocompleteProps[T, Multiple, DisableClearable, FreeSolo]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AutocompleteProps[?, ?, ?, ?], T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */] (val x: Self & (AutocompleteProps[T, Multiple, DisableClearable, FreeSolo])) extends AnyVal {
      
      inline def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      inline def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
      
      inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      inline def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      inline def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      inline def `setAria-atomic`(value: Booleanish): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
      
      inline def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
      
      inline def `setAria-autocomplete`(value: "none" | "inline" | "list" | "both"): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      inline def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      inline def `setAria-busy`(value: Booleanish): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
      
      inline def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
      
      inline def `setAria-checked`(value: Boolean | "mixed"): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
      
      inline def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
      
      inline def `setAria-colcount`(value: Double): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
      
      inline def `setAria-colindex`(value: Double): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
      
      inline def `setAria-colspan`(value: Double): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
      
      inline def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      inline def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      inline def `setAria-current`(value: Boolean | "page" | "step" | "location" | "date" | "time"): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
      
      inline def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
      
      inline def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
      
      inline def `setAria-disabled`(value: Booleanish): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
      
      inline def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
      
      inline def `setAria-dropeffect`(value: "none" | "copy" | "execute" | "link" | "move" | "popup"): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
      
      inline def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
      
      inline def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      inline def `setAria-expanded`(value: Booleanish): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      inline def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
      
      inline def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
      
      inline def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
      
      inline def `setAria-grabbed`(value: Booleanish): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
      
      inline def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
      
      inline def `setAria-haspopup`(value: Boolean | "menu" | "listbox" | "tree" | "grid" | "dialog"): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      inline def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      inline def `setAria-hidden`(value: Booleanish): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
      inline def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
      
      inline def `setAria-invalid`(value: Boolean | "grammar" | "spelling"): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
      
      inline def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
      
      inline def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      inline def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      inline def `setAria-level`(value: Double): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
      
      inline def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
      
      inline def `setAria-live`(value: "off" | "assertive" | "polite"): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      inline def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
      
      inline def `setAria-modal`(value: Booleanish): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
      
      inline def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
      
      inline def `setAria-multiline`(value: Booleanish): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
      
      inline def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
      
      inline def `setAria-multiselectable`(value: Booleanish): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
      
      inline def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
      
      inline def `setAria-orientation`(value: "horizontal" | "vertical"): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
      
      inline def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
      
      inline def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
      
      inline def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
      
      inline def `setAria-placeholder`(value: String): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
      
      inline def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
      
      inline def `setAria-posinset`(value: Double): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
      
      inline def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
      
      inline def `setAria-pressed`(value: Boolean | "mixed"): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
      
      inline def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
      
      inline def `setAria-readonly`(value: Booleanish): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
      
      inline def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
      
      inline def `setAria-relevant`(
        value: "additions" | ("additions removals") | ("additions text") | "all" | "removals" | ("removals additions") | ("removals text") | "text" | ("text additions") | ("text removals")
      ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
      
      inline def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
      
      inline def `setAria-required`(value: Booleanish): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
      
      inline def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
      
      inline def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
      
      inline def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
      
      inline def `setAria-rowcount`(value: Double): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
      
      inline def `setAria-rowindex`(value: Double): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
      
      inline def `setAria-rowspan`(value: Double): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
      
      inline def `setAria-selected`(value: Booleanish): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
      
      inline def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
      
      inline def `setAria-setsize`(value: Double): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
      
      inline def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
      
      inline def `setAria-sort`(value: "none" | "ascending" | "descending" | "other"): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
      
      inline def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
      
      inline def `setAria-valuemax`(value: Double): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
      
      inline def `setAria-valuemin`(value: Double): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
      
      inline def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
      
      inline def `setAria-valuenow`(value: Double): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
      
      inline def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
      
      inline def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
      
      inline def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
      
      inline def setAutoComplete(value: Boolean): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      inline def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
      
      inline def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setAutoHighlight(value: Boolean): Self = StObject.set(x, "autoHighlight", value.asInstanceOf[js.Any])
      
      inline def setAutoHighlightUndefined: Self = StObject.set(x, "autoHighlight", js.undefined)
      
      inline def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
      
      inline def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
      
      inline def setAutoSelect(value: Boolean): Self = StObject.set(x, "autoSelect", value.asInstanceOf[js.Any])
      
      inline def setAutoSelectUndefined: Self = StObject.set(x, "autoSelect", js.undefined)
      
      inline def setBlurOnSelect(value: "touch" | "mouse" | true | false): Self = StObject.set(x, "blurOnSelect", value.asInstanceOf[js.Any])
      
      inline def setBlurOnSelectUndefined: Self = StObject.set(x, "blurOnSelect", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClearIcon(value: VdomNode): Self = StObject.set(x, "clearIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setClearIconNull: Self = StObject.set(x, "clearIcon", null)
      
      inline def setClearIconUndefined: Self = StObject.set(x, "clearIcon", js.undefined)
      
      inline def setClearIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "clearIcon", js.Array(value*))
      
      inline def setClearIconVdomElement(value: VdomElement): Self = StObject.set(x, "clearIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClearOnBlur(value: Boolean): Self = StObject.set(x, "clearOnBlur", value.asInstanceOf[js.Any])
      
      inline def setClearOnBlurUndefined: Self = StObject.set(x, "clearOnBlur", js.undefined)
      
      inline def setClearOnEscape(value: Boolean): Self = StObject.set(x, "clearOnEscape", value.asInstanceOf[js.Any])
      
      inline def setClearOnEscapeUndefined: Self = StObject.set(x, "clearOnEscape", js.undefined)
      
      inline def setClearText(value: String): Self = StObject.set(x, "clearText", value.asInstanceOf[js.Any])
      
      inline def setClearTextUndefined: Self = StObject.set(x, "clearText", js.undefined)
      
      inline def setCloseText(value: String): Self = StObject.set(x, "closeText", value.asInstanceOf[js.Any])
      
      inline def setCloseTextUndefined: Self = StObject.set(x, "closeText", js.undefined)
      
      inline def setColor(value: OverridableStringUnion[ColorPaletteProp, AutocompletePropsColorOverrides]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setComponentName(value: String): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
      
      inline def setComponentNameUndefined: Self = StObject.set(x, "componentName", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentEditable(value: Booleanish | "inherit"): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
      
      inline def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      inline def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      inline def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
      
      inline def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
      
      inline def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      inline def setDefaultValue(value: AutocompleteValue[T, Multiple, DisableClearable, FreeSolo]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: (T | AutocompleteFreeSoloValueMapping[FreeSolo])*): Self = StObject.set(x, "defaultValue", js.Array(value*))
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
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
      
      inline def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setEndDecorator(value: VdomNode): Self = StObject.set(x, "endDecorator", value.rawNode.asInstanceOf[js.Any])
      
      inline def setEndDecoratorNull: Self = StObject.set(x, "endDecorator", null)
      
      inline def setEndDecoratorUndefined: Self = StObject.set(x, "endDecorator", js.undefined)
      
      inline def setEndDecoratorVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "endDecorator", js.Array(value*))
      
      inline def setEndDecoratorVdomElement(value: VdomElement): Self = StObject.set(x, "endDecorator", value.rawElement.asInstanceOf[js.Any])
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setFilterOptions(value: (/* options */ js.Array[T], /* state */ FilterOptionsState[T]) => js.Array[T]): Self = StObject.set(x, "filterOptions", js.Any.fromFunction2(value))
      
      inline def setFilterOptionsUndefined: Self = StObject.set(x, "filterOptions", js.undefined)
      
      inline def setFilterSelectedOptions(value: Boolean): Self = StObject.set(x, "filterSelectedOptions", value.asInstanceOf[js.Any])
      
      inline def setFilterSelectedOptionsUndefined: Self = StObject.set(x, "filterSelectedOptions", js.undefined)
      
      inline def setForcePopupIcon(value: true | false | "auto"): Self = StObject.set(x, "forcePopupIcon", value.asInstanceOf[js.Any])
      
      inline def setForcePopupIconUndefined: Self = StObject.set(x, "forcePopupIcon", js.undefined)
      
      inline def setFreeSolo(value: FreeSolo): Self = StObject.set(x, "freeSolo", value.asInstanceOf[js.Any])
      
      inline def setFreeSoloUndefined: Self = StObject.set(x, "freeSolo", js.undefined)
      
      inline def setGetLimitTagsText(value: /* more */ String | Double => Node): Self = StObject.set(x, "getLimitTagsText", js.Any.fromFunction1(value))
      
      inline def setGetLimitTagsTextUndefined: Self = StObject.set(x, "getLimitTagsText", js.undefined)
      
      inline def setGetOptionDisabled(value: /* option */ T => Boolean): Self = StObject.set(x, "getOptionDisabled", js.Any.fromFunction1(value))
      
      inline def setGetOptionDisabledUndefined: Self = StObject.set(x, "getOptionDisabled", js.undefined)
      
      inline def setGetOptionLabel(value: /* option */ T | AutocompleteFreeSoloValueMapping[FreeSolo] => String): Self = StObject.set(x, "getOptionLabel", js.Any.fromFunction1(value))
      
      inline def setGetOptionLabelUndefined: Self = StObject.set(x, "getOptionLabel", js.undefined)
      
      inline def setGroupBy(value: /* option */ T => String): Self = StObject.set(x, "groupBy", js.Any.fromFunction1(value))
      
      inline def setGroupByUndefined: Self = StObject.set(x, "groupBy", js.undefined)
      
      inline def setHandleHomeEndKeys(value: Boolean): Self = StObject.set(x, "handleHomeEndKeys", value.asInstanceOf[js.Any])
      
      inline def setHandleHomeEndKeysUndefined: Self = StObject.set(x, "handleHomeEndKeys", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIncludeInputInList(value: Boolean): Self = StObject.set(x, "includeInputInList", value.asInstanceOf[js.Any])
      
      inline def setIncludeInputInListUndefined: Self = StObject.set(x, "includeInputInList", js.undefined)
      
      inline def setInlist(value: Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
      
      inline def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
      
      inline def setInputMode(value: "none" | "text" | "tel" | "url" | "email" | "numeric" | "decimal" | "search"): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      inline def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      inline def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
      
      inline def setInputValueUndefined: Self = StObject.set(x, "inputValue", js.undefined)
      
      inline def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      inline def setIsOptionEqualToValue(value: (/* option */ T, /* value */ T) => Boolean): Self = StObject.set(x, "isOptionEqualToValue", js.Any.fromFunction2(value))
      
      inline def setIsOptionEqualToValueUndefined: Self = StObject.set(x, "isOptionEqualToValue", js.undefined)
      
      inline def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
      
      inline def setItemID(value: String): Self = StObject.set(x, "itemID", value.asInstanceOf[js.Any])
      
      inline def setItemIDUndefined: Self = StObject.set(x, "itemID", js.undefined)
      
      inline def setItemProp(value: String): Self = StObject.set(x, "itemProp", value.asInstanceOf[js.Any])
      
      inline def setItemPropUndefined: Self = StObject.set(x, "itemProp", js.undefined)
      
      inline def setItemRef(value: String): Self = StObject.set(x, "itemRef", value.asInstanceOf[js.Any])
      
      inline def setItemRefUndefined: Self = StObject.set(x, "itemRef", js.undefined)
      
      inline def setItemScope(value: Boolean): Self = StObject.set(x, "itemScope", value.asInstanceOf[js.Any])
      
      inline def setItemScopeUndefined: Self = StObject.set(x, "itemScope", js.undefined)
      
      inline def setItemType(value: String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      inline def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setLimitTags(value: Double): Self = StObject.set(x, "limitTags", value.asInstanceOf[js.Any])
      
      inline def setLimitTagsUndefined: Self = StObject.set(x, "limitTags", js.undefined)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingText(value: VdomNode): Self = StObject.set(x, "loadingText", value.rawNode.asInstanceOf[js.Any])
      
      inline def setLoadingTextNull: Self = StObject.set(x, "loadingText", null)
      
      inline def setLoadingTextUndefined: Self = StObject.set(x, "loadingText", js.undefined)
      
      inline def setLoadingTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "loadingText", js.Array(value*))
      
      inline def setLoadingTextVdomElement(value: VdomElement): Self = StObject.set(x, "loadingText", value.rawElement.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setMultiple(value: Multiple): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNoOptionsText(value: VdomNode): Self = StObject.set(x, "noOptionsText", value.rawNode.asInstanceOf[js.Any])
      
      inline def setNoOptionsTextNull: Self = StObject.set(x, "noOptionsText", null)
      
      inline def setNoOptionsTextUndefined: Self = StObject.set(x, "noOptionsText", js.undefined)
      
      inline def setNoOptionsTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "noOptionsText", js.Array(value*))
      
      inline def setNoOptionsTextVdomElement(value: VdomElement): Self = StObject.set(x, "noOptionsText", value.rawElement.asInstanceOf[js.Any])
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setOnAbort(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAbort", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      inline def setOnAnimationEnd(value: ReactAnimationEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      inline def setOnAnimationIteration(value: ReactAnimationEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
      
      inline def setOnAnimationStart(value: ReactAnimationEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
      
      inline def setOnAuxClick(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
      
      inline def setOnBeforeInput(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
      
      inline def setOnBlur(value: ReactFocusEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnCanPlay(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnCanPlayThrough(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
      
      inline def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
      
      inline def setOnChange(
        value: (/* event */ ReactEventFrom[org.scalajs.dom.Element], /* value */ AutocompleteValue[T, Multiple, DisableClearable, FreeSolo], /* reason */ AutocompleteChangeReason, /* details */ js.UndefOr[AutocompleteChangeDetails[T]]) => Callback
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction4((t0: /* event */ ReactEventFrom[org.scalajs.dom.Element], t1: /* value */ AutocompleteValue[T, Multiple, DisableClearable, FreeSolo], t2: /* reason */ AutocompleteChangeReason, t3: /* details */ js.UndefOr[AutocompleteChangeDetails[T]]) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClick(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnClose(
        value: (/* event */ ReactEventFrom[org.scalajs.dom.Element], /* reason */ AutocompleteCloseReason) => Callback
      ): Self = StObject.set(x, "onClose", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[org.scalajs.dom.Element], t1: /* reason */ AutocompleteCloseReason) => (value(t0, t1)).runNow()))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnCompositionEnd(value: ReactCompositionEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
      
      inline def setOnCompositionStart(value: ReactCompositionEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
      
      inline def setOnCompositionUpdate(value: ReactCompositionEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
      
      inline def setOnContextMenu(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnCopy(value: ReactClipboardEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCopy", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      inline def setOnCut(value: ReactClipboardEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCut", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
      
      inline def setOnDoubleClick(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      inline def setOnDrag(value: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDrag", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDragEnd(value: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      inline def setOnDragEnter(value: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      inline def setOnDragExit(value: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
      
      inline def setOnDragLeave(value: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      inline def setOnDragOver(value: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      inline def setOnDragStart(value: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      inline def setOnDrop(value: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDrop", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      inline def setOnDurationChange(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
      
      inline def setOnEmptied(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
      
      inline def setOnEncrypted(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
      
      inline def setOnEnded(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onEnded", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      inline def setOnError(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnFocus(value: ReactFocusEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnHighlightChange(
        value: (/* event */ ReactEventFrom[org.scalajs.dom.Element], /* option */ T | Null, /* reason */ AutocompleteHighlightChangeReason) => Callback
      ): Self = StObject.set(x, "onHighlightChange", js.Any.fromFunction3((t0: /* event */ ReactEventFrom[org.scalajs.dom.Element], t1: /* option */ T | Null, t2: /* reason */ AutocompleteHighlightChangeReason) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnHighlightChangeUndefined: Self = StObject.set(x, "onHighlightChange", js.undefined)
      
      inline def setOnInput(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnInputChange(
        value: (/* event */ ReactEventFrom[org.scalajs.dom.Element], /* value */ String, /* reason */ AutocompleteInputChangeReason) => Callback
      ): Self = StObject.set(x, "onInputChange", js.Any.fromFunction3((t0: /* event */ ReactEventFrom[org.scalajs.dom.Element], t1: /* value */ String, t2: /* reason */ AutocompleteInputChangeReason) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnInputChangeUndefined: Self = StObject.set(x, "onInputChange", js.undefined)
      
      inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      inline def setOnInvalid(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
      
      inline def setOnKeyDown(value: /* event */ KeyboardEventHTMLDivElement => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: /* event */ KeyboardEventHTMLDivElement) => value(t0).runNow()))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyPress(value: ReactKeyboardEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setOnKeyUp(value: ReactKeyboardEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setOnLoad(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onLoad", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnLoadStart(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnLoadedData(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
      
      inline def setOnLoadedMetadata(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
      
      inline def setOnMouseDown(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnMouseEnter(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setOnMouseOut(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      inline def setOnMouseOver(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      inline def setOnMouseUp(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      inline def setOnOpen(value: /* event */ ReactEventFrom[org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onOpen", js.Any.fromFunction1((t0: /* event */ ReactEventFrom[org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      inline def setOnPaste(value: ReactClipboardEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPaste", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      inline def setOnPause(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPause", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      inline def setOnPlay(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      inline def setOnPlaying(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
      
      inline def setOnPointerCancel(value: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      inline def setOnPointerDown(value: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      inline def setOnPointerEnter(value: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      inline def setOnPointerLeave(value: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      inline def setOnPointerMove(value: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      inline def setOnPointerOut(value: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
      
      inline def setOnPointerOver(value: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
      
      inline def setOnPointerUp(value: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      inline def setOnProgress(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onProgress", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      inline def setOnRateChange(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
      
      inline def setOnReset(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onReset", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      inline def setOnResize(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onResize", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      inline def setOnScroll(value: ReactUIEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onScroll", js.Any.fromFunction1((t0: ReactUIEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setOnSeeked(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
      
      inline def setOnSeeking(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
      
      inline def setOnSelect(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOnStalled(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onStalled", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
      
      inline def setOnSubmit(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      inline def setOnSuspend(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
      
      inline def setOnTimeUpdate(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
      
      inline def setOnTouchCancel(value: ReactTouchEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      inline def setOnTouchEnd(value: ReactTouchEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      inline def setOnTouchMove(value: ReactTouchEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      inline def setOnTouchStart(value: ReactTouchEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      inline def setOnTransitionEnd(value: ReactTransitionEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1((t0: ReactTransitionEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      inline def setOnVolumeChange(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
      
      inline def setOnWaiting(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
      
      inline def setOnWheel(value: ReactWheelEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onWheel", js.Any.fromFunction1((t0: ReactWheelEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenOnFocus(value: Boolean): Self = StObject.set(x, "openOnFocus", value.asInstanceOf[js.Any])
      
      inline def setOpenOnFocusUndefined: Self = StObject.set(x, "openOnFocus", js.undefined)
      
      inline def setOpenText(value: String): Self = StObject.set(x, "openText", value.asInstanceOf[js.Any])
      
      inline def setOpenTextUndefined: Self = StObject.set(x, "openText", js.undefined)
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setOptions(value: js.Array[T]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: T*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPopupIcon(value: VdomNode): Self = StObject.set(x, "popupIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setPopupIconNull: Self = StObject.set(x, "popupIcon", null)
      
      inline def setPopupIconUndefined: Self = StObject.set(x, "popupIcon", js.undefined)
      
      inline def setPopupIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "popupIcon", js.Array(value*))
      
      inline def setPopupIconVdomElement(value: VdomElement): Self = StObject.set(x, "popupIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      inline def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
      
      inline def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
      
      inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
      
      inline def setRenderGroup(value: /* params */ AutocompleteRenderGroupParams => Node): Self = StObject.set(x, "renderGroup", js.Any.fromFunction1(value))
      
      inline def setRenderGroupUndefined: Self = StObject.set(x, "renderGroup", js.undefined)
      
      inline def setRenderOption(
        value: (/* props */ OmitHTMLAttributesHTMLLIElementcolor, /* option */ T, /* state */ AutocompleteRenderOptionState) => Node
      ): Self = StObject.set(x, "renderOption", js.Any.fromFunction3(value))
      
      inline def setRenderOptionUndefined: Self = StObject.set(x, "renderOption", js.undefined)
      
      inline def setRenderTags(
        value: (/* value */ js.Array[T], /* getTagProps */ AutocompleteRenderGetTagProps, /* ownerState */ AutocompleteOwnerState[T, Multiple, DisableClearable, FreeSolo]) => Node
      ): Self = StObject.set(x, "renderTags", js.Any.fromFunction3(value))
      
      inline def setRenderTagsUndefined: Self = StObject.set(x, "renderTags", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      inline def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      inline def setRev(value: String): Self = StObject.set(x, "rev", value.asInstanceOf[js.Any])
      
      inline def setRevUndefined: Self = StObject.set(x, "rev", js.undefined)
      
      inline def setRole(value: AriaRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      inline def setSelectOnFocus(value: Boolean): Self = StObject.set(x, "selectOnFocus", value.asInstanceOf[js.Any])
      
      inline def setSelectOnFocusUndefined: Self = StObject.set(x, "selectOnFocus", js.undefined)
      
      inline def setSize(value: OverridableStringUnion["sm" | "md" | "lg", AutocompletePropsSizeOverrides]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      inline def setSlotProps(value: Input): Self = StObject.set(x, "slotProps", value.asInstanceOf[js.Any])
      
      inline def setSlotPropsUndefined: Self = StObject.set(x, "slotProps", js.undefined)
      
      inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      inline def setSlots(value: PartialAutocompleteSlots): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
      
      inline def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
      
      inline def setSpellCheck(value: Booleanish): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
      
      inline def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
      
      inline def setStartDecorator(value: VdomNode): Self = StObject.set(x, "startDecorator", value.rawNode.asInstanceOf[js.Any])
      
      inline def setStartDecoratorNull: Self = StObject.set(x, "startDecorator", null)
      
      inline def setStartDecoratorUndefined: Self = StObject.set(x, "startDecorator", js.undefined)
      
      inline def setStartDecoratorVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "startDecorator", js.Array(value*))
      
      inline def setStartDecoratorVdomElement(value: VdomElement): Self = StObject.set(x, "startDecorator", value.rawElement.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSuppressContentEditableWarning(value: Boolean): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
      
      inline def setSuppressHydrationWarning(value: Boolean): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
      
      inline def setSx(value: SxProps): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
      
      inline def setSxFunction1(value: Theme => SystemStyleObject[Theme]): Self = StObject.set(x, "sx", js.Any.fromFunction1(value))
      
      inline def setSxNull: Self = StObject.set(x, "sx", null)
      
      inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
      
      inline def setSxVarargs(value: (Boolean | SystemStyleObject[Theme] | (js.Function1[Theme, SystemStyleObject[Theme]]))*): Self = StObject.set(x, "sx", js.Array(value*))
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTranslate(value: "yes" | "no"): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
      
      inline def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
      
      inline def setUnselectable(value: "on" | "off"): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      inline def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
      
      inline def setUnstable_classNamePrefix(value: String): Self = StObject.set(x, "unstable_classNamePrefix", value.asInstanceOf[js.Any])
      
      inline def setUnstable_classNamePrefixUndefined: Self = StObject.set(x, "unstable_classNamePrefix", js.undefined)
      
      inline def setUnstable_isActiveElementInListbox(value: /* listbox */ RefHandle[HTMLElement] => Boolean): Self = StObject.set(x, "unstable_isActiveElementInListbox", js.Any.fromFunction1(value))
      
      inline def setUnstable_isActiveElementInListboxUndefined: Self = StObject.set(x, "unstable_isActiveElementInListbox", js.undefined)
      
      inline def setValue(value: AutocompleteValue[T, Multiple, DisableClearable, FreeSolo]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: (T | AutocompleteFreeSoloValueMapping[FreeSolo])*): Self = StObject.set(x, "value", js.Array(value*))
      
      inline def setVariant(value: OverridableStringUnion[VariantProp, AutocompletePropsVariantOverrides]): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
      
      inline def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
      
      inline def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
    }
  }
  
  trait AutocompletePropsColorOverrides extends StObject
  
  trait AutocompletePropsSizeOverrides extends StObject
  
  trait AutocompletePropsVariantOverrides extends StObject
  
  type AutocompleteRenderGetTagProps = js.Function1[/* param0 */ Index, Datatagindex]
  
  trait AutocompleteRenderGroupParams extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var group: String
    
    var key: String
  }
  object AutocompleteRenderGroupParams {
    
    inline def apply(group: String, key: String): AutocompleteRenderGroupParams = {
      val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutocompleteRenderGroupParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AutocompleteRenderGroupParams] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait AutocompleteRenderOptionState extends StObject {
    
    var inputValue: String
    
    var ownerState: AutocompleteOwnerState[Any, Any, Any, Any]
    
    var selected: Boolean
  }
  object AutocompleteRenderOptionState {
    
    inline def apply(inputValue: String, ownerState: AutocompleteOwnerState[Any, Any, Any, Any], selected: Boolean): AutocompleteRenderOptionState = {
      val __obj = js.Dynamic.literal(inputValue = inputValue.asInstanceOf[js.Any], ownerState = ownerState.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutocompleteRenderOptionState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AutocompleteRenderOptionState] (val x: Self) extends AnyVal {
      
      inline def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
      
      inline def setOwnerState(value: AutocompleteOwnerState[Any, Any, Any, Any]): Self = StObject.set(x, "ownerState", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
  
  object AutocompleteSlot {
    
    inline def clearIndicator: "clearIndicator" = "clearIndicator".asInstanceOf["clearIndicator"]
    
    inline def endDecorator: "endDecorator" = "endDecorator".asInstanceOf["endDecorator"]
    
    inline def input: "input" = "input".asInstanceOf["input"]
    
    inline def limitTag: "limitTag" = "limitTag".asInstanceOf["limitTag"]
    
    inline def listbox: "listbox" = "listbox".asInstanceOf["listbox"]
    
    inline def loading: "loading" = "loading".asInstanceOf["loading"]
    
    inline def noOptions: "noOptions" = "noOptions".asInstanceOf["noOptions"]
    
    inline def option: "option" = "option".asInstanceOf["option"]
    
    inline def popupIndicator: "popupIndicator" = "popupIndicator".asInstanceOf["popupIndicator"]
    
    inline def root: "root" = "root".asInstanceOf["root"]
    
    inline def startDecorator: "startDecorator" = "startDecorator".asInstanceOf["startDecorator"]
    
    inline def wrapper: "wrapper" = "wrapper".asInstanceOf["wrapper"]
  }
  type AutocompleteSlot = "root" | "wrapper" | "input" | "startDecorator" | "endDecorator" | "clearIndicator" | "popupIndicator" | "listbox" | "option" | "loading" | "noOptions" | "limitTag"
  
  trait AutocompleteSlots extends StObject {
    
    /**
      * The component that renders the clear indicator.
      * @default 'button'
      */
    var clearIndicator: ElementType
    
    /**
      * The component that renders the end decorator.
      * @default 'span'
      */
    var endDecorator: ElementType
    
    /**
      * The component that renders the input.
      * @default 'input'
      */
    var input: ElementType
    
    /**
      * The component that renders the limit tag.
      * @default 'span'
      */
    var limitTag: ElementType
    
    /**
      * The component that renders the listbox.
      * @default 'ul'
      */
    var listbox: ElementType
    
    /**
      * The component that renders the loading.
      * @default 'li'
      */
    var loading: ElementType
    
    /**
      * The component that renders the no-options.
      * @default 'li'
      */
    var noOptions: ElementType
    
    /**
      * The component that renders the option.
      * @default 'li'
      */
    var option: ElementType
    
    /**
      * The component that renders the popup indicator.
      * @default 'button'
      */
    var popupIndicator: ElementType
    
    /**
      * The component that renders the root.
      * @default 'div'
      */
    var root: ElementType
    
    /**
      * The component that renders the start decorator.
      * @default 'span'
      */
    var startDecorator: ElementType
    
    /**
      * The component that renders the wrapper.
      * @default 'div'
      */
    var wrapper: ElementType
  }
  object AutocompleteSlots {
    
    inline def apply(
      clearIndicator: ElementType,
      endDecorator: ElementType,
      input: ElementType,
      limitTag: ElementType,
      listbox: ElementType,
      loading: ElementType,
      noOptions: ElementType,
      option: ElementType,
      popupIndicator: ElementType,
      root: ElementType,
      startDecorator: ElementType,
      wrapper: ElementType
    ): AutocompleteSlots = {
      val __obj = js.Dynamic.literal(clearIndicator = clearIndicator.asInstanceOf[js.Any], endDecorator = endDecorator.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], limitTag = limitTag.asInstanceOf[js.Any], listbox = listbox.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], noOptions = noOptions.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any], popupIndicator = popupIndicator.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], startDecorator = startDecorator.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutocompleteSlots]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AutocompleteSlots] (val x: Self) extends AnyVal {
      
      inline def setClearIndicator(value: ElementType): Self = StObject.set(x, "clearIndicator", value.asInstanceOf[js.Any])
      
      inline def setEndDecorator(value: ElementType): Self = StObject.set(x, "endDecorator", value.asInstanceOf[js.Any])
      
      inline def setInput(value: ElementType): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setLimitTag(value: ElementType): Self = StObject.set(x, "limitTag", value.asInstanceOf[js.Any])
      
      inline def setListbox(value: ElementType): Self = StObject.set(x, "listbox", value.asInstanceOf[js.Any])
      
      inline def setLoading(value: ElementType): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setNoOptions(value: ElementType): Self = StObject.set(x, "noOptions", value.asInstanceOf[js.Any])
      
      inline def setOption(value: ElementType): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
      
      inline def setPopupIndicator(value: ElementType): Self = StObject.set(x, "popupIndicator", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: ElementType): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setStartDecorator(value: ElementType): Self = StObject.set(x, "startDecorator", value.asInstanceOf[js.Any])
      
      inline def setWrapper(value: ElementType): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    }
  }
  
  type AutocompleteSlotsAndSlotProps = CreateSlotsAndSlotProps[AutocompleteSlots, ClearIndicator]
}
