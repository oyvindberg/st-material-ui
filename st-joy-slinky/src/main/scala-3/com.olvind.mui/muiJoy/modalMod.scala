package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsModalTypeMapdiv
import com.olvind.mui.muiJoy.modalModalClassesMod.ModalClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalMod {
  
  @JSImport("@mui/joy/Modal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Modal](https://mui.com/joy-ui/react-modal/)
    *
    * API:
    *
    * - [Modal API](https://mui.com/joy-ui/api/modal/)
    */
  @JSImport("@mui/joy/Modal", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsModalTypeMapdiv, Element | Null] = js.native
  
  inline def getModalUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getModalUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/joy/Modal", "modalClasses")
  @js.native
  val modalClasses: ModalClasses = js.native
}
