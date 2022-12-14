package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.autocompleteUnstyledUseAutocompleteMod.AutocompleteGetTagProps
import com.olvind.mui.muiBase.autocompleteUnstyledUseAutocompleteMod.AutocompleteGroupedOption
import com.olvind.mui.muiBase.autocompleteUnstyledUseAutocompleteMod.AutocompleteValue
import com.olvind.mui.react.mod.HTMLAttributes
import com.olvind.mui.react.mod.InputHTMLAttributes
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLLIElement
import org.scalajs.dom.HTMLUListElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnchorEl[T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */] extends StObject {
  
  var anchorEl: Null | HTMLElement = js.native
  
  var dirty: Boolean = js.native
  
  var focused: Boolean = js.native
  
  var focusedTag: Double = js.native
  
  def getClearProps(): HTMLAttributes[HTMLButtonElement] = js.native
  
  // We pass `getInputLabelProps()` to `@mui/material/InputLabel` which does not implement HTMLLabelElement#color.
  def getInputLabelProps(): OmitHTMLAttributesHTMLLabelElementcolor = js.native
  
  def getInputProps(): InputHTMLAttributes[HTMLInputElement] = js.native
  
  def getListboxProps(): HTMLAttributes[HTMLUListElement] = js.native
  
  def getOptionProps(param0: Index[T]): HTMLAttributes[HTMLLIElement] = js.native
  
  def getPopupIndicatorProps(): HTMLAttributes[HTMLButtonElement] = js.native
  
  def getRootProps(): HTMLAttributes[HTMLDivElement] = js.native
  def getRootProps(externalProps: Any): HTMLAttributes[HTMLDivElement] = js.native
  
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
