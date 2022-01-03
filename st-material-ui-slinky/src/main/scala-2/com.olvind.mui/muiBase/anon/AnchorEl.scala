package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.useAutocompleteMod.AutocompleteFreeSoloValueMapping
import com.olvind.mui.muiBase.useAutocompleteMod.AutocompleteGetTagProps
import com.olvind.mui.muiBase.useAutocompleteMod.AutocompleteGroupedOption
import com.olvind.mui.muiBase.useAutocompleteMod.AutocompleteValue
import com.olvind.mui.react.mod.HTMLAttributes
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLLIElement
import org.scalajs.dom.HTMLUListElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnchorEl[T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */] extends StObject {
  
  var anchorEl: Null | HTMLElement = js.native
  
  var dirty: Boolean = js.native
  
  var focused: Boolean = js.native
  
  var focusedTag: Double = js.native
  
  def getClearProps(): HTMLAttributes[HTMLDivElement] = js.native
  
  // We pass `getInputLabelProps()` to `@mui/material/InputLabel` which does not implement HTMLLabelElement#color.
  def getInputLabelProps(): OmitHTMLAttributesHTMLLabelElementcolor = js.native
  
  def getInputProps(): HTMLAttributes[HTMLInputElement] = js.native
  
  def getListboxProps(): HTMLAttributes[HTMLUListElement] = js.native
  
  def getOptionProps(hasOptionIndex: Index[T]): HTMLAttributes[HTMLLIElement] = js.native
  
  def getPopupIndicatorProps(): HTMLAttributes[HTMLDivElement] = js.native
  
  def getRootProps(): HTMLAttributes[HTMLDivElement] = js.native
  
  var getTagProps: AutocompleteGetTagProps = js.native
  
  /**
    * The options to render. It's either `T[]` or `AutocompleteGroupedOption<T>[]` if the groupBy prop is provided.
    */
  var groupedOptions: js.Array[AutocompleteGroupedOption[T] | T] = js.native
  
  var id: String = js.native
  
  var inputValue: String = js.native
  
  var popupOpen: Boolean = js.native
  
  def setAnchorEl(): Unit = js.native
  
  var value: AutocompleteValue[T, Multiple, DisableClearable, FreeSolo] = js.native
}
object AnchorEl {
  
  @scala.inline
  def apply[T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */](
    dirty: Boolean,
    focused: Boolean,
    focusedTag: Double,
    getClearProps: () => HTMLAttributes[HTMLDivElement],
    getInputLabelProps: () => OmitHTMLAttributesHTMLLabelElementcolor,
    getInputProps: () => HTMLAttributes[HTMLInputElement],
    getListboxProps: () => HTMLAttributes[HTMLUListElement],
    getOptionProps: Index[T] => HTMLAttributes[HTMLLIElement],
    getPopupIndicatorProps: () => HTMLAttributes[HTMLDivElement],
    getRootProps: () => HTMLAttributes[HTMLDivElement],
    getTagProps: /* hasIndex */ IndexNumber => Datatagindex,
    groupedOptions: js.Array[AutocompleteGroupedOption[T] | T],
    id: String,
    inputValue: String,
    popupOpen: Boolean,
    setAnchorEl: () => Unit
  ): AnchorEl[T, Multiple, DisableClearable, FreeSolo] = {
    val __obj = js.Dynamic.literal(dirty = dirty.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], focusedTag = focusedTag.asInstanceOf[js.Any], getClearProps = js.Any.fromFunction0(getClearProps), getInputLabelProps = js.Any.fromFunction0(getInputLabelProps), getInputProps = js.Any.fromFunction0(getInputProps), getListboxProps = js.Any.fromFunction0(getListboxProps), getOptionProps = js.Any.fromFunction1(getOptionProps), getPopupIndicatorProps = js.Any.fromFunction0(getPopupIndicatorProps), getRootProps = js.Any.fromFunction0(getRootProps), getTagProps = js.Any.fromFunction1(getTagProps), groupedOptions = groupedOptions.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputValue = inputValue.asInstanceOf[js.Any], popupOpen = popupOpen.asInstanceOf[js.Any], setAnchorEl = js.Any.fromFunction0(setAnchorEl), anchorEl = null, value = null)
    __obj.asInstanceOf[AnchorEl[T, Multiple, DisableClearable, FreeSolo]]
  }
  
  @scala.inline
  implicit class AnchorElMutableBuilder[Self <: AnchorEl[_, _, _, _], T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */] (val x: Self with (AnchorEl[T, Multiple, DisableClearable, FreeSolo])) extends AnyVal {
    
    @scala.inline
    def setAnchorEl(value: HTMLElement): Self = StObject.set(x, "anchorEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorElNull: Self = StObject.set(x, "anchorEl", null)
    
    @scala.inline
    def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusedTag(value: Double): Self = StObject.set(x, "focusedTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetClearProps(value: () => HTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "getClearProps", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInputLabelProps(value: () => OmitHTMLAttributesHTMLLabelElementcolor): Self = StObject.set(x, "getInputLabelProps", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInputProps(value: () => HTMLAttributes[HTMLInputElement]): Self = StObject.set(x, "getInputProps", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetListboxProps(value: () => HTMLAttributes[HTMLUListElement]): Self = StObject.set(x, "getListboxProps", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOptionProps(value: Index[T] => HTMLAttributes[HTMLLIElement]): Self = StObject.set(x, "getOptionProps", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPopupIndicatorProps(value: () => HTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "getPopupIndicatorProps", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRootProps(value: () => HTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "getRootProps", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTagProps(value: /* hasIndex */ IndexNumber => Datatagindex): Self = StObject.set(x, "getTagProps", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGroupedOptions(value: js.Array[AutocompleteGroupedOption[T] | T]): Self = StObject.set(x, "groupedOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupedOptionsVarargs(value: (AutocompleteGroupedOption[T] | T)*): Self = StObject.set(x, "groupedOptions", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupOpen(value: Boolean): Self = StObject.set(x, "popupOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetAnchorEl(value: () => Unit): Self = StObject.set(x, "setAnchorEl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValue(value: AutocompleteValue[T, Multiple, DisableClearable, FreeSolo]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
    
    @scala.inline
    def setValueVarargs(value: (T | AutocompleteFreeSoloValueMapping[FreeSolo])*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
