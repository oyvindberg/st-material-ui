package com.olvind.mui.muiJoy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemDecoratorListItemDecoratorClassesMod {
  
  @JSImport("@mui/joy/ListItemDecorator/listItemDecoratorClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/ListItemDecorator/listItemDecoratorClasses", JSImport.Default)
  @js.native
  val default: ListItemDecoratorClasses = js.native
  
  inline def getListItemDecoratorUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getListItemDecoratorUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type ListItemDecoratorClassKey = "root"
  
  trait ListItemDecoratorClasses extends StObject {
    
    /** Styles applied to the root element. */
    var root: String
  }
  object ListItemDecoratorClasses {
    
    inline def apply(root: String): ListItemDecoratorClasses = {
      val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListItemDecoratorClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListItemDecoratorClasses] (val x: Self) extends AnyVal {
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
