package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsModalOverflowTypeMa
import com.olvind.mui.muiJoy.modalOverflowModalOverflowClassesMod.ModalOverflowClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalOverflowMod {
  
  @JSImport("@mui/joy/ModalOverflow", JSImport.Namespace)
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
    * - [ModalOverflow API](https://mui.com/joy-ui/api/modal-overflow/)
    */
  @JSImport("@mui/joy/ModalOverflow", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsModalOverflowTypeMa, Element | Null] = js.native
  
  inline def getModalOverflowUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getModalOverflowUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/joy/ModalOverflow", "modalOverflowClasses")
  @js.native
  val modalOverflowClasses: ModalOverflowClasses = js.native
}
