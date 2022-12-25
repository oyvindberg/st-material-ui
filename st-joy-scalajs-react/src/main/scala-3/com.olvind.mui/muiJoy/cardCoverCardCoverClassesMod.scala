package com.olvind.mui.muiJoy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardCoverCardCoverClassesMod {
  
  @JSImport("@mui/joy/CardCover/cardCoverClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/CardCover/cardCoverClasses", JSImport.Default)
  @js.native
  val default: CardCoverClasses = js.native
  
  inline def getCardCoverUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCardCoverUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type CardCoverClassKey = "root"
  
  trait CardCoverClasses extends StObject {
    
    /** Styles applied to the root element. */
    var root: String
  }
  object CardCoverClasses {
    
    inline def apply(root: String): CardCoverClasses = {
      val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardCoverClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CardCoverClasses] (val x: Self) extends AnyVal {
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
