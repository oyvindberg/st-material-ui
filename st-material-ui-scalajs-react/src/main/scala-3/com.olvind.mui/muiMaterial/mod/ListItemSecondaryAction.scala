package com.olvind.mui.muiMaterial.mod

import com.olvind.mui.muiMaterial.listItemSecondaryActionListItemSecondaryActionMod.ListItemSecondaryActionProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Must be used as the last child of ListItem to function properly.
  *
  * Demos:
  *
  * - [Lists](https://mui.com/components/lists/)
  *
  * API:
  *
  * - [ListItemSecondaryAction API](https://mui.com/api/list-item-secondary-action/)
  */
/* Inlined (props : @mui/material.@mui/material/ListItemSecondaryAction/ListItemSecondaryAction.ListItemSecondaryActionProps): react.react.<global>.JSX.Element & {  muiName :string} */
object ListItemSecondaryAction {
  
  inline def apply(props: ListItemSecondaryActionProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@mui/material", "ListItemSecondaryAction")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material", "ListItemSecondaryAction.muiName")
  @js.native
  def muiName: String = js.native
  inline def muiName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("muiName")(x.asInstanceOf[js.Any])
}
