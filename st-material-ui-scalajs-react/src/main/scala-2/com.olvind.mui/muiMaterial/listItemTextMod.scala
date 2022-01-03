package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.listItemTextClassesMod.ListItemTextClasses
import com.olvind.mui.muiMaterial.listItemTextListItemTextMod.ListItemTextProps
import com.olvind.mui.react.mod.global.JSX.Element
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemTextMod {
  
  @JSImport("@mui/material/ListItemText", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[PrimaryTypographyComponent /* <: ElementType */, SecondaryTypographyComponent /* <: ElementType */](props: ListItemTextProps[PrimaryTypographyComponent, SecondaryTypographyComponent]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def getListItemTextUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getListItemTextUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/ListItemText", "listItemTextClasses")
  @js.native
  val listItemTextClasses: ListItemTextClasses = js.native
}
