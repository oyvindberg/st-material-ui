package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autocompleteAutocompleteClassesMod {
  
  @JSImport("@mui/material/Autocomplete/autocompleteClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/Autocomplete/autocompleteClasses", JSImport.Default)
  @js.native
  val default: AutocompleteClasses = js.native
  
  inline def getAutocompleteUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAutocompleteUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type AutocompleteClassKey = "root" | "fullWidth" | "focused" | "tag" | "tagSizeSmall" | "tagSizeMedium" | "hasPopupIcon" | "hasClearIcon" | "inputRoot" | "input" | "inputFocused" | "endAdornment" | "clearIndicator" | "popupIndicator" | "popupIndicatorOpen" | "popper" | "popperDisablePortal" | "paper" | "listbox" | "loading" | "noOptions" | "option" | "groupLabel" | "groupUl"
  
  trait AutocompleteClasses extends StObject {
    
    /** Styles applied to the clear indicator. */
    var clearIndicator: String
    
    /** Styles applied to the endAdornment element. */
    var endAdornment: String
    
    /** State class applied to the root element if focused. */
    var focused: String
    
    /** Styles applied to the root element if `fullWidth={true}`. */
    var fullWidth: String
    
    /** Styles applied to the group's label elements. */
    var groupLabel: String
    
    /** Styles applied to the group's ul elements. */
    var groupUl: String
    
    /** Styles applied when the clear icon is rendered. */
    var hasClearIcon: String
    
    /** Styles applied when the popup icon is rendered. */
    var hasPopupIcon: String
    
    /** Styles applied to the input element. */
    var input: String
    
    /** Styles applied to the input element if the input is focused. */
    var inputFocused: String
    
    /** Styles applied to the Input element. */
    var inputRoot: String
    
    /** Styles applied to the listbox component. */
    var listbox: String
    
    /** Styles applied to the loading wrapper. */
    var loading: String
    
    /** Styles applied to the no option wrapper. */
    var noOptions: String
    
    /** Styles applied to the option elements. */
    var option: String
    
    /** Styles applied to the Paper component. */
    var paper: String
    
    /** Styles applied to the popper element. */
    var popper: String
    
    /** Styles applied to the popper element if `disablePortal={true}`. */
    var popperDisablePortal: String
    
    /** Styles applied to the popup indicator. */
    var popupIndicator: String
    
    /** Styles applied to the popup indicator if the popup is open. */
    var popupIndicatorOpen: String
    
    /** Styles applied to the root element. */
    var root: String
    
    /** Styles applied to the tag elements, e.g. the chips. */
    var tag: String
    
    /** Styles applied to the tag elements, e.g. the chips if `size="medium"`. */
    var tagSizeMedium: String
    
    /** Styles applied to the tag elements, e.g. the chips if `size="small"`. */
    var tagSizeSmall: String
  }
  object AutocompleteClasses {
    
    inline def apply(
      clearIndicator: String,
      endAdornment: String,
      focused: String,
      fullWidth: String,
      groupLabel: String,
      groupUl: String,
      hasClearIcon: String,
      hasPopupIcon: String,
      input: String,
      inputFocused: String,
      inputRoot: String,
      listbox: String,
      loading: String,
      noOptions: String,
      option: String,
      paper: String,
      popper: String,
      popperDisablePortal: String,
      popupIndicator: String,
      popupIndicatorOpen: String,
      root: String,
      tag: String,
      tagSizeMedium: String,
      tagSizeSmall: String
    ): AutocompleteClasses = {
      val __obj = js.Dynamic.literal(clearIndicator = clearIndicator.asInstanceOf[js.Any], endAdornment = endAdornment.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], fullWidth = fullWidth.asInstanceOf[js.Any], groupLabel = groupLabel.asInstanceOf[js.Any], groupUl = groupUl.asInstanceOf[js.Any], hasClearIcon = hasClearIcon.asInstanceOf[js.Any], hasPopupIcon = hasPopupIcon.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], inputFocused = inputFocused.asInstanceOf[js.Any], inputRoot = inputRoot.asInstanceOf[js.Any], listbox = listbox.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], noOptions = noOptions.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any], paper = paper.asInstanceOf[js.Any], popper = popper.asInstanceOf[js.Any], popperDisablePortal = popperDisablePortal.asInstanceOf[js.Any], popupIndicator = popupIndicator.asInstanceOf[js.Any], popupIndicatorOpen = popupIndicatorOpen.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagSizeMedium = tagSizeMedium.asInstanceOf[js.Any], tagSizeSmall = tagSizeSmall.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutocompleteClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AutocompleteClasses] (val x: Self) extends AnyVal {
      
      inline def setClearIndicator(value: String): Self = StObject.set(x, "clearIndicator", value.asInstanceOf[js.Any])
      
      inline def setEndAdornment(value: String): Self = StObject.set(x, "endAdornment", value.asInstanceOf[js.Any])
      
      inline def setFocused(value: String): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setFullWidth(value: String): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
      
      inline def setGroupLabel(value: String): Self = StObject.set(x, "groupLabel", value.asInstanceOf[js.Any])
      
      inline def setGroupUl(value: String): Self = StObject.set(x, "groupUl", value.asInstanceOf[js.Any])
      
      inline def setHasClearIcon(value: String): Self = StObject.set(x, "hasClearIcon", value.asInstanceOf[js.Any])
      
      inline def setHasPopupIcon(value: String): Self = StObject.set(x, "hasPopupIcon", value.asInstanceOf[js.Any])
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputFocused(value: String): Self = StObject.set(x, "inputFocused", value.asInstanceOf[js.Any])
      
      inline def setInputRoot(value: String): Self = StObject.set(x, "inputRoot", value.asInstanceOf[js.Any])
      
      inline def setListbox(value: String): Self = StObject.set(x, "listbox", value.asInstanceOf[js.Any])
      
      inline def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setNoOptions(value: String): Self = StObject.set(x, "noOptions", value.asInstanceOf[js.Any])
      
      inline def setOption(value: String): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
      
      inline def setPaper(value: String): Self = StObject.set(x, "paper", value.asInstanceOf[js.Any])
      
      inline def setPopper(value: String): Self = StObject.set(x, "popper", value.asInstanceOf[js.Any])
      
      inline def setPopperDisablePortal(value: String): Self = StObject.set(x, "popperDisablePortal", value.asInstanceOf[js.Any])
      
      inline def setPopupIndicator(value: String): Self = StObject.set(x, "popupIndicator", value.asInstanceOf[js.Any])
      
      inline def setPopupIndicatorOpen(value: String): Self = StObject.set(x, "popupIndicatorOpen", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagSizeMedium(value: String): Self = StObject.set(x, "tagSizeMedium", value.asInstanceOf[js.Any])
      
      inline def setTagSizeSmall(value: String): Self = StObject.set(x, "tagSizeSmall", value.asInstanceOf[js.Any])
    }
  }
}
