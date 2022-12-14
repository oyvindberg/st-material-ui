package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.autocompleteAutocompletePropsMod.AutocompleteOwnerState
import com.olvind.mui.muiJoy.utilsTypesMod.SlotCommonProps
import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Omit
import com.olvind.mui.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ P in keyof {  root :@mui/joy.@mui/joy/utils/types.SlotProps<'div', {}, @mui/joy.@mui/joy/Autocomplete/AutocompleteProps.AutocompleteOwnerState<any, any, any, any>>,   wrapper :@mui/joy.@mui/joy/utils/types.SlotProps<'div', {}, @mui/joy.@mui/joy/Autocomplete/AutocompleteProps.AutocompleteOwnerState<any, any, any, any>>,   input :@mui/joy.@mui/joy/utils/types.SlotProps<'input', {}, @mui/joy.@mui/joy/Autocomplete/AutocompleteProps.AutocompleteOwnerState<any, any, any, any>>,   startDecorator :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Autocomplete/AutocompleteProps.AutocompleteOwnerState<any, any, any, any>>,   endDecorator :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Autocomplete/AutocompleteProps.AutocompleteOwnerState<any, any, any, any>>,   clearIndicator :@mui/joy.@mui/joy/utils/types.SlotProps<'button', {  color :@mui/types.@mui/types.OverridableStringUnion<@mui/joy.@mui/joy/styles/types.ColorPaletteProp, @mui/joy.@mui/joy/Autocomplete/AutocompleteProps.AutocompletePropsColorOverrides> | undefined,   variant :@mui/types.@mui/types.OverridableStringUnion<@mui/joy.@mui/joy/styles/types.VariantProp, @mui/joy.@mui/joy/Autocomplete/AutocompleteProps.AutocompletePropsVariantOverrides> | undefined,   size :@mui/types.@mui/types.OverridableStringUnion<'sm' | 'md' | 'lg', @mui/joy.@mui/joy/Autocomplete/AutocompleteProps.AutocompletePropsSizeOverrides> | undefined}, @mui/joy.@mui/joy/Autocomplete/AutocompleteProps.AutocompleteOwnerState<any, any, any, any>>,   popupIndicator :@mui/joy.@mui/joy/utils/types.SlotProps<'button', {  color :@mui/types.@mui/types.OverridableStringUnion<@mui/joy.@mui/joy/styles/types.ColorPaletteProp, @mui/joy.@mui/joy/Autocomplete/AutocompleteProps.AutocompletePropsColorOverrides> | undefined,   variant :@mui/types.@mui/types.OverridableStringUnion<@mui/joy.@mui/joy/styles/types.VariantProp, @mui/joy.@mui/joy/Autocomplete/AutocompleteProps.AutocompletePropsVariantOverrides> | undefined,   size :@mui/types.@mui/types.OverridableStringUnion<'sm' | 'md' | 'lg', @mui/joy.@mui/joy/Autocomplete/AutocompleteProps.AutocompletePropsSizeOverrides> | undefined}, @mui/joy.@mui/joy/Autocomplete/AutocompleteProps.AutocompleteOwnerState<any, any, any, any>>,   listbox :@mui/joy.@mui/joy/utils/types.SlotProps<'ul', {} & Omit<PopperUnstyledOwnProps, 'slots' | 'slotProps' | 'open'>, @mui/joy.@mui/joy/Autocomplete/AutocompleteProps.AutocompleteOwnerState<any, any, any, any>>,   option :@mui/joy.@mui/joy/utils/types.SlotProps<'li', {  color :@mui/types.@mui/types.OverridableStringUnion<@mui/joy.@mui/joy/styles/types.ColorPaletteProp, @mui/joy.@mui/joy/Autocomplete/AutocompleteProps.AutocompletePropsColorOverrides> | undefined,   variant :@mui/types.@mui/types.OverridableStringUnion<@mui/joy.@mui/joy/styles/types.VariantProp, @mui/joy.@mui/joy/Autocomplete/AutocompleteProps.AutocompletePropsVariantOverrides> | undefined}, @mui/joy.@mui/joy/Autocomplete/AutocompleteProps.AutocompleteOwnerState<any, any, any, any>>,   loading :@mui/joy.@mui/joy/utils/types.SlotProps<'li', {}, @mui/joy.@mui/joy/Autocomplete/AutocompleteProps.AutocompleteOwnerState<any, any, any, any>>,   noOptions :@mui/joy.@mui/joy/utils/types.SlotProps<'li', {}, @mui/joy.@mui/joy/Autocomplete/AutocompleteProps.AutocompleteOwnerState<any, any, any, any>>,   limitTag :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Autocomplete/AutocompleteProps.AutocompleteOwnerState<any, any, any, any>>} ]:? {  root :@mui/joy.@mui/joy/utils/types.SlotProps<'div', {}, @mui/joy.@mui/joy/Autocomplete/AutocompleteProps.AutocompleteOwnerState<any, any, any, any>>,   wrapper :@mui/joy.@mui/joy/utils/types.SlotProps<'div', {}, @mui/joy.@mui/joy/Autocomplete/AutocompleteProps.AutocompleteOwnerState<any, any, any, any>>,   input :@mui/joy.@mui/joy/utils/types.SlotProps<'input', {}, @mui/joy.@mui/joy/Autocomplete/AutocompleteProps.AutocompleteOwnerState<any, any, any, any>>,   startDecorator :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Autocomplete/AutocompleteProps.AutocompleteOwnerState<any, any, any, any>>,   endDecorator :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Autocomplete/AutocompleteProps.AutocompleteOwnerState<any, any, any, any>>,   clearIndicator :@mui/joy.@mui/joy/utils/types.SlotProps<'button', {  color :@mui/types.@mui/types.OverridableStringUnion<@mui/joy.@mui/joy/styles/types.ColorPaletteProp, @mui/joy.@mui/joy/Autocomplete/AutocompleteProps.AutocompletePropsColorOverrides> | undefined,   variant :@mui/types.@mui/types.OverridableStringUnion<@mui/joy.@mui/joy/styles/types.VariantProp, @mui/joy.@mui/joy/Autocomplete/AutocompleteProps.AutocompletePropsVariantOverrides> | undefined,   size :@mui/types.@mui/types.OverridableStringUnion<'sm' | 'md' | 'lg', @mui/joy.@mui/joy/Autocomplete/AutocompleteProps.AutocompletePropsSizeOverrides> | undefined}, @mui/joy.@mui/joy/Autocomplete/AutocompleteProps.AutocompleteOwnerState<any, any, any, any>>,   popupIndicator :@mui/joy.@mui/joy/utils/types.SlotProps<'button', {  color :@mui/types.@mui/types.OverridableStringUnion<@mui/joy.@mui/joy/styles/types.ColorPaletteProp, @mui/joy.@mui/joy/Autocomplete/AutocompleteProps.AutocompletePropsColorOverrides> | undefined,   variant :@mui/types.@mui/types.OverridableStringUnion<@mui/joy.@mui/joy/styles/types.VariantProp, @mui/joy.@mui/joy/Autocomplete/AutocompleteProps.AutocompletePropsVariantOverrides> | undefined,   size :@mui/types.@mui/types.OverridableStringUnion<'sm' | 'md' | 'lg', @mui/joy.@mui/joy/Autocomplete/AutocompleteProps.AutocompletePropsSizeOverrides> | undefined}, @mui/joy.@mui/joy/Autocomplete/AutocompleteProps.AutocompleteOwnerState<any, any, any, any>>,   listbox :@mui/joy.@mui/joy/utils/types.SlotProps<'ul', {} & Omit<PopperUnstyledOwnProps, 'slots' | 'slotProps' | 'open'>, @mui/joy.@mui/joy/Autocomplete/AutocompleteProps.AutocompleteOwnerState<any, any, any, any>>,   option :@mui/joy.@mui/joy/utils/types.SlotProps<'li', {  color :@mui/types.@mui/types.OverridableStringUnion<@mui/joy.@mui/joy/styles/types.ColorPaletteProp, @mui/joy.@mui/joy/Autocomplete/AutocompleteProps.AutocompletePropsColorOverrides> | undefined,   variant :@mui/types.@mui/types.OverridableStringUnion<@mui/joy.@mui/joy/styles/types.VariantProp, @mui/joy.@mui/joy/Autocomplete/AutocompleteProps.AutocompletePropsVariantOverrides> | undefined}, @mui/joy.@mui/joy/Autocomplete/AutocompleteProps.AutocompleteOwnerState<any, any, any, any>>,   loading :@mui/joy.@mui/joy/utils/types.SlotProps<'li', {}, @mui/joy.@mui/joy/Autocomplete/AutocompleteProps.AutocompleteOwnerState<any, any, any, any>>,   noOptions :@mui/joy.@mui/joy/utils/types.SlotProps<'li', {}, @mui/joy.@mui/joy/Autocomplete/AutocompleteProps.AutocompleteOwnerState<any, any, any, any>>,   limitTag :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Autocomplete/AutocompleteProps.AutocompleteOwnerState<any, any, any, any>>}[P]} */
trait Input extends StObject {
  
  var clearIndicator: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["button", Size, AutocompleteOwnerState[Any, Any, Any, Any]]
  ] = js.undefined
  
  var endDecorator: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, AutocompleteOwnerState[Any, Any, Any, Any]]
  ] = js.undefined
  
  var input: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["input", js.Object, AutocompleteOwnerState[Any, Any, Any, Any]]
  ] = js.undefined
  
  var limitTag: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, AutocompleteOwnerState[Any, Any, Any, Any]]
  ] = js.undefined
  
  var listbox: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps[
      "ul", 
      OmitPopperUnstyledOwnPropsslotsslotProps, 
      AutocompleteOwnerState[Any, Any, Any, Any]
    ]
  ] = js.undefined
  
  var loading: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["li", js.Object, AutocompleteOwnerState[Any, Any, Any, Any]]
  ] = js.undefined
  
  var noOptions: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["li", js.Object, AutocompleteOwnerState[Any, Any, Any, Any]]
  ] = js.undefined
  
  var option: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["li", Variant, AutocompleteOwnerState[Any, Any, Any, Any]]
  ] = js.undefined
  
  var popupIndicator: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["button", Size, AutocompleteOwnerState[Any, Any, Any, Any]]
  ] = js.undefined
  
  var root: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, AutocompleteOwnerState[Any, Any, Any, Any]]
  ] = js.undefined
  
  var startDecorator: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, AutocompleteOwnerState[Any, Any, Any, Any]]
  ] = js.undefined
  
  var wrapper: js.UndefOr[
    com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, AutocompleteOwnerState[Any, Any, Any, Any]]
  ] = js.undefined
}
object Input {
  
  inline def apply(): Input = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Input]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Input] (val x: Self) extends AnyVal {
    
    inline def setClearIndicator(
      value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["button", Size, AutocompleteOwnerState[Any, Any, Any, Any]]
    ): Self = StObject.set(x, "clearIndicator", value.asInstanceOf[js.Any])
    
    inline def setClearIndicatorFunction1(
      value: AutocompleteOwnerState[Any, Any, Any, Any] => (Omit[ComponentPropsWithRef["button"], "color"]) & Size & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "clearIndicator", js.Any.fromFunction1(value))
    
    inline def setClearIndicatorUndefined: Self = StObject.set(x, "clearIndicator", js.undefined)
    
    inline def setEndDecorator(
      value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, AutocompleteOwnerState[Any, Any, Any, Any]]
    ): Self = StObject.set(x, "endDecorator", value.asInstanceOf[js.Any])
    
    inline def setEndDecoratorFunction1(
      value: AutocompleteOwnerState[Any, Any, Any, Any] => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "endDecorator", js.Any.fromFunction1(value))
    
    inline def setEndDecoratorUndefined: Self = StObject.set(x, "endDecorator", js.undefined)
    
    inline def setInput(
      value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["input", js.Object, AutocompleteOwnerState[Any, Any, Any, Any]]
    ): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputFunction1(
      value: AutocompleteOwnerState[Any, Any, Any, Any] => (Omit[ComponentPropsWithRef["input"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "input", js.Any.fromFunction1(value))
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setLimitTag(
      value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, AutocompleteOwnerState[Any, Any, Any, Any]]
    ): Self = StObject.set(x, "limitTag", value.asInstanceOf[js.Any])
    
    inline def setLimitTagFunction1(
      value: AutocompleteOwnerState[Any, Any, Any, Any] => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "limitTag", js.Any.fromFunction1(value))
    
    inline def setLimitTagUndefined: Self = StObject.set(x, "limitTag", js.undefined)
    
    inline def setListbox(
      value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps[
          "ul", 
          OmitPopperUnstyledOwnPropsslotsslotProps, 
          AutocompleteOwnerState[Any, Any, Any, Any]
        ]
    ): Self = StObject.set(x, "listbox", value.asInstanceOf[js.Any])
    
    inline def setListboxFunction1(
      value: AutocompleteOwnerState[Any, Any, Any, Any] => (Omit[ComponentPropsWithRef["ul"], "color"]) & OmitPopperUnstyledOwnPropsslotsslotProps & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "listbox", js.Any.fromFunction1(value))
    
    inline def setListboxUndefined: Self = StObject.set(x, "listbox", js.undefined)
    
    inline def setLoading(
      value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["li", js.Object, AutocompleteOwnerState[Any, Any, Any, Any]]
    ): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setLoadingFunction1(
      value: AutocompleteOwnerState[Any, Any, Any, Any] => (Omit[ComponentPropsWithRef["li"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "loading", js.Any.fromFunction1(value))
    
    inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    inline def setNoOptions(
      value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["li", js.Object, AutocompleteOwnerState[Any, Any, Any, Any]]
    ): Self = StObject.set(x, "noOptions", value.asInstanceOf[js.Any])
    
    inline def setNoOptionsFunction1(
      value: AutocompleteOwnerState[Any, Any, Any, Any] => (Omit[ComponentPropsWithRef["li"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "noOptions", js.Any.fromFunction1(value))
    
    inline def setNoOptionsUndefined: Self = StObject.set(x, "noOptions", js.undefined)
    
    inline def setOption(
      value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["li", Variant, AutocompleteOwnerState[Any, Any, Any, Any]]
    ): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
    
    inline def setOptionFunction1(
      value: AutocompleteOwnerState[Any, Any, Any, Any] => (Omit[ComponentPropsWithRef["li"], "color"]) & Variant & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "option", js.Any.fromFunction1(value))
    
    inline def setOptionUndefined: Self = StObject.set(x, "option", js.undefined)
    
    inline def setPopupIndicator(
      value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["button", Size, AutocompleteOwnerState[Any, Any, Any, Any]]
    ): Self = StObject.set(x, "popupIndicator", value.asInstanceOf[js.Any])
    
    inline def setPopupIndicatorFunction1(
      value: AutocompleteOwnerState[Any, Any, Any, Any] => (Omit[ComponentPropsWithRef["button"], "color"]) & Size & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "popupIndicator", js.Any.fromFunction1(value))
    
    inline def setPopupIndicatorUndefined: Self = StObject.set(x, "popupIndicator", js.undefined)
    
    inline def setRoot(
      value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, AutocompleteOwnerState[Any, Any, Any, Any]]
    ): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(
      value: AutocompleteOwnerState[Any, Any, Any, Any] => (Omit[ComponentPropsWithRef["div"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setStartDecorator(
      value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["span", js.Object, AutocompleteOwnerState[Any, Any, Any, Any]]
    ): Self = StObject.set(x, "startDecorator", value.asInstanceOf[js.Any])
    
    inline def setStartDecoratorFunction1(
      value: AutocompleteOwnerState[Any, Any, Any, Any] => (Omit[ComponentPropsWithRef["span"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "startDecorator", js.Any.fromFunction1(value))
    
    inline def setStartDecoratorUndefined: Self = StObject.set(x, "startDecorator", js.undefined)
    
    inline def setWrapper(
      value: com.olvind.mui.muiJoy.utilsTypesMod.SlotProps["div", js.Object, AutocompleteOwnerState[Any, Any, Any, Any]]
    ): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    
    inline def setWrapperFunction1(
      value: AutocompleteOwnerState[Any, Any, Any, Any] => (Omit[ComponentPropsWithRef["div"], "color"]) & js.Object & SlotCommonProps & (Record[String, Any])
    ): Self = StObject.set(x, "wrapper", js.Any.fromFunction1(value))
    
    inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
  }
}
