package com.olvind.mui.muiMaterial

import com.olvind.mui.muiBase.anon.AnchorEl
import com.olvind.mui.muiBase.useAutocompleteMod.CreateFilterOptionsConfig
import com.olvind.mui.muiBase.useAutocompleteMod.FilterOptionsState
import com.olvind.mui.muiBase.useAutocompleteMod.UseAutocompleteProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useAutocompleteMod {
  
  @JSImport("@mui/material/useAutocomplete", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createFilterOptions[T](): js.Function2[/* options */ js.Array[T], /* state */ FilterOptionsState[T], js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFilterOptions")().asInstanceOf[js.Function2[/* options */ js.Array[T], /* state */ FilterOptionsState[T], js.Array[T]]]
  inline def createFilterOptions[T](config: CreateFilterOptionsConfig[T]): js.Function2[/* options */ js.Array[T], /* state */ FilterOptionsState[T], js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFilterOptions")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* options */ js.Array[T], /* state */ FilterOptionsState[T], js.Array[T]]]
  
  inline def useAutocomplete[T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */](props: UseAutocompleteProps[T, Multiple, DisableClearable, FreeSolo]): AnchorEl[T, Multiple, DisableClearable, FreeSolo] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAutocomplete")(props.asInstanceOf[js.Any]).asInstanceOf[AnchorEl[T, Multiple, DisableClearable, FreeSolo]]
}
