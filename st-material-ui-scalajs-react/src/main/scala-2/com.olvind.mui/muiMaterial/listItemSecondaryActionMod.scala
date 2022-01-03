package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.listItemSecondaryActionClassesMod.ListItemSecondaryActionClasses
import com.olvind.mui.muiMaterial.listItemSecondaryActionListItemSecondaryActionMod.ListItemSecondaryActionProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemSecondaryActionMod {
  
  @JSImport("@mui/material/ListItemSecondaryAction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  object default {
    
    @scala.inline
    def apply(props: ListItemSecondaryActionProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@mui/material/ListItemSecondaryAction", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@mui/material/ListItemSecondaryAction", "default.muiName")
    @js.native
    def muiName: String = js.native
    @scala.inline
    def muiName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("muiName")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def getListItemSecondaryActionClassesUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getListItemSecondaryActionClassesUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/ListItemSecondaryAction", "listItemSecondaryActionClasses")
  @js.native
  val listItemSecondaryActionClasses: ListItemSecondaryActionClasses = js.native
}
