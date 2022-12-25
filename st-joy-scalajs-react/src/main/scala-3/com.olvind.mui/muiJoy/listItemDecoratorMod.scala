package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsListItemDecoratorTy
import com.olvind.mui.muiJoy.listItemDecoratorListItemDecoratorClassesMod.ListItemDecoratorClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemDecoratorMod {
  
  @JSImport("@mui/joy/ListItemDecorator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/ListItemDecorator", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsListItemDecoratorTy, Element | Null] = js.native
  
  inline def getListItemDecoratorUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getListItemDecoratorUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/joy/ListItemDecorator", "listItemDecoratorClasses")
  @js.native
  val listItemDecoratorClasses: ListItemDecoratorClasses = js.native
}
