package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsTypographyTypeMapsp
import com.olvind.mui.muiJoy.typographyTypographyClassesMod.TypographyClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typographyMod {
  
  @JSImport("@mui/joy/Typography", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Typography](https://mui.com/joy-ui/react-typography/)
    *
    * API:
    *
    * - [Typography API](https://mui.com/joy-ui/api/typography/)
    */
  @JSImport("@mui/joy/Typography", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsTypographyTypeMapsp, Element | Null] = js.native
  
  inline def getTypographyUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypographyUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/joy/Typography", "typographyClasses")
  @js.native
  val typographyClasses: TypographyClasses = js.native
}
