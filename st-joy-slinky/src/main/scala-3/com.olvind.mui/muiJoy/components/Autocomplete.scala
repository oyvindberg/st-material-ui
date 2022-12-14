package com.olvind.mui.muiJoy.components

import com.olvind.mui.muiJoy.autocompleteAutocompletePropsMod.AutocompleteProps
import com.olvind.mui.StyledComponent.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Autocomplete {
  
  inline def apply[T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */](options: js.Array[T]): SharedBuilder_AutocompleteProps1189109439[T, Multiple, DisableClearable, FreeSolo] = {
    val __props = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    new SharedBuilder_AutocompleteProps1189109439[T, Multiple, DisableClearable, FreeSolo](js.Array(this.component, __props.asInstanceOf[AutocompleteProps[T, Multiple, DisableClearable, FreeSolo]]))
  }
  
  @JSImport("@mui/joy", "Autocomplete")
  @js.native
  val component: js.Object = js.native
  
  type Props[T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */] = AutocompleteProps[T, Multiple, DisableClearable, FreeSolo]
  
  def styled[T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */]: Builder[
    AutocompleteProps[T, Multiple, DisableClearable, FreeSolo], 
    SharedBuilder_AutocompleteProps1189109439[T, Multiple, DisableClearable, FreeSolo]
  ] = new Builder[
    AutocompleteProps[T, Multiple, DisableClearable, FreeSolo], 
    SharedBuilder_AutocompleteProps1189109439[T, Multiple, DisableClearable, FreeSolo]
  ](this.component, new js.Object, js.Array(), (newComponent: Any) => new SharedBuilder_AutocompleteProps1189109439[T, Multiple, DisableClearable, FreeSolo](js.Array(newComponent, js.Dictionary.empty)))
  
  def withProps[T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */](p: AutocompleteProps[T, Multiple, DisableClearable, FreeSolo]): SharedBuilder_AutocompleteProps1189109439[T, Multiple, DisableClearable, FreeSolo] = new SharedBuilder_AutocompleteProps1189109439[T, Multiple, DisableClearable, FreeSolo](js.Array(this.component, p.asInstanceOf[js.Any]))
}
