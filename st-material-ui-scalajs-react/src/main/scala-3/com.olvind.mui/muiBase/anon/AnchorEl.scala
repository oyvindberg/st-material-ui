package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.useAutocompleteMod.AutocompleteFreeSoloValueMapping
import com.olvind.mui.muiBase.useAutocompleteMod.AutocompleteGetTagProps
import com.olvind.mui.muiBase.useAutocompleteMod.AutocompleteGroupedOption
import com.olvind.mui.muiBase.useAutocompleteMod.AutocompleteValue
import com.olvind.mui.react.mod.HTMLAttributes
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLLIElement
import org.scalajs.dom.HTMLUListElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnchorEl[T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */] extends StObject {
  
  var anchorEl: Null | HTMLElement
  
  var dirty: Boolean
  
  var focused: Boolean
  
  var focusedTag: Double
  
  def getClearProps(): HTMLAttributes[HTMLDivElement]
  
  // We pass `getInputLabelProps()` to `@mui/material/InputLabel` which does not implement HTMLLabelElement#color.
  def getInputLabelProps(): OmitHTMLAttributesHTMLLabelElementcolor
  
  def getInputProps(): HTMLAttributes[HTMLInputElement]
  
  def getListboxProps(): HTMLAttributes[HTMLUListElement]
  
  def getOptionProps(hasOptionIndex: Index[T]): HTMLAttributes[HTMLLIElement]
  
  def getPopupIndicatorProps(): HTMLAttributes[HTMLDivElement]
  
  def getRootProps(): HTMLAttributes[HTMLDivElement]
  
  var getTagProps: AutocompleteGetTagProps
  
  /**
    * The options to render. It's either `T[]` or `AutocompleteGroupedOption<T>[]` if the groupBy prop is provided.
    */
  var groupedOptions: js.Array[AutocompleteGroupedOption[T] | T]
  
  var id: String
  
  var inputValue: String
  
  var popupOpen: Boolean
  
  def setAnchorEl(): Unit
  
  var value: AutocompleteValue[T, Multiple, DisableClearable, FreeSolo]
}
object AnchorEl {
  
  inline def apply[T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */](
    dirty: Boolean,
    focused: Boolean,
    focusedTag: Double,
    getClearProps: CallbackTo[HTMLAttributes[HTMLDivElement]],
    getInputLabelProps: CallbackTo[OmitHTMLAttributesHTMLLabelElementcolor],
    getInputProps: CallbackTo[HTMLAttributes[HTMLInputElement]],
    getListboxProps: CallbackTo[HTMLAttributes[HTMLUListElement]],
    getOptionProps: Index[T] => HTMLAttributes[HTMLLIElement],
    getPopupIndicatorProps: CallbackTo[HTMLAttributes[HTMLDivElement]],
    getRootProps: CallbackTo[HTMLAttributes[HTMLDivElement]],
    getTagProps: /* hasIndex */ IndexNumber => Datatagindex,
    groupedOptions: js.Array[AutocompleteGroupedOption[T] | T],
    id: String,
    inputValue: String,
    popupOpen: Boolean,
    setAnchorEl: Callback
  ): AnchorEl[T, Multiple, DisableClearable, FreeSolo] = {
    val __obj = js.Dynamic.literal(dirty = dirty.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], focusedTag = focusedTag.asInstanceOf[js.Any], getClearProps = getClearProps.toJsFn, getInputLabelProps = getInputLabelProps.toJsFn, getInputProps = getInputProps.toJsFn, getListboxProps = getListboxProps.toJsFn, getOptionProps = js.Any.fromFunction1(getOptionProps), getPopupIndicatorProps = getPopupIndicatorProps.toJsFn, getRootProps = getRootProps.toJsFn, getTagProps = js.Any.fromFunction1(getTagProps), groupedOptions = groupedOptions.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputValue = inputValue.asInstanceOf[js.Any], popupOpen = popupOpen.asInstanceOf[js.Any], setAnchorEl = setAnchorEl.toJsFn, anchorEl = null, value = null)
    __obj.asInstanceOf[AnchorEl[T, Multiple, DisableClearable, FreeSolo]]
  }
  
  extension [Self <: AnchorEl[?, ?, ?, ?], T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */](x: Self & (AnchorEl[T, Multiple, DisableClearable, FreeSolo])) {
    
    inline def setAnchorEl(value: HTMLElement): Self = StObject.set(x, "anchorEl", value.asInstanceOf[js.Any])
    
    inline def setAnchorElNull: Self = StObject.set(x, "anchorEl", null)
    
    inline def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
    
    inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
    
    inline def setFocusedTag(value: Double): Self = StObject.set(x, "focusedTag", value.asInstanceOf[js.Any])
    
    inline def setGetClearProps(value: CallbackTo[HTMLAttributes[HTMLDivElement]]): Self = StObject.set(x, "getClearProps", value.toJsFn)
    
    inline def setGetInputLabelProps(value: CallbackTo[OmitHTMLAttributesHTMLLabelElementcolor]): Self = StObject.set(x, "getInputLabelProps", value.toJsFn)
    
    inline def setGetInputProps(value: CallbackTo[HTMLAttributes[HTMLInputElement]]): Self = StObject.set(x, "getInputProps", value.toJsFn)
    
    inline def setGetListboxProps(value: CallbackTo[HTMLAttributes[HTMLUListElement]]): Self = StObject.set(x, "getListboxProps", value.toJsFn)
    
    inline def setGetOptionProps(value: Index[T] => HTMLAttributes[HTMLLIElement]): Self = StObject.set(x, "getOptionProps", js.Any.fromFunction1(value))
    
    inline def setGetPopupIndicatorProps(value: CallbackTo[HTMLAttributes[HTMLDivElement]]): Self = StObject.set(x, "getPopupIndicatorProps", value.toJsFn)
    
    inline def setGetRootProps(value: CallbackTo[HTMLAttributes[HTMLDivElement]]): Self = StObject.set(x, "getRootProps", value.toJsFn)
    
    inline def setGetTagProps(value: /* hasIndex */ IndexNumber => Datatagindex): Self = StObject.set(x, "getTagProps", js.Any.fromFunction1(value))
    
    inline def setGroupedOptions(value: js.Array[AutocompleteGroupedOption[T] | T]): Self = StObject.set(x, "groupedOptions", value.asInstanceOf[js.Any])
    
    inline def setGroupedOptionsVarargs(value: (AutocompleteGroupedOption[T] | T)*): Self = StObject.set(x, "groupedOptions", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
    
    inline def setPopupOpen(value: Boolean): Self = StObject.set(x, "popupOpen", value.asInstanceOf[js.Any])
    
    inline def setSetAnchorEl(value: Callback): Self = StObject.set(x, "setAnchorEl", value.toJsFn)
    
    inline def setValue(value: AutocompleteValue[T, Multiple, DisableClearable, FreeSolo]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueVarargs(value: (T | AutocompleteFreeSoloValueMapping[FreeSolo])*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
