package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsLinkTypeMapa
import com.olvind.mui.muiJoy.linkLinkClassesMod.LinkClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkMod {
  
  @JSImport("@mui/joy/Link", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/Link", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsLinkTypeMapa, Element | Null] = js.native
  
  inline def getLinkUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLinkUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/joy/Link", "linkClasses")
  @js.native
  val linkClasses: LinkClasses = js.native
}
