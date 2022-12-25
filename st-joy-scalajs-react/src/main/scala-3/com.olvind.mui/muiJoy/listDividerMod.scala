package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsListDividerTypeMapl
import com.olvind.mui.muiJoy.listDividerListDividerClassesMod.ListDividerClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listDividerMod {
  
  @JSImport("@mui/joy/ListDivider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/ListDivider", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsListDividerTypeMapl, Element | Null] = js.native
  
  inline def getListDividerUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getListDividerUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/joy/ListDivider", "listDividerClasses")
  @js.native
  val listDividerClasses: ListDividerClasses = js.native
}
