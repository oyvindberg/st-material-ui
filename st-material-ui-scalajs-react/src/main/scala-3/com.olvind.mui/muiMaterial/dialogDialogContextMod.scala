package com.olvind.mui.muiMaterial

import com.olvind.mui.react.mod.Context
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogDialogContextMod extends Shortcut {
  
  @JSImport("@mui/material/Dialog/DialogContext", JSImport.Default)
  @js.native
  val default: Context[DialogContextValue] = js.native
  
  trait DialogContextValue extends StObject {
    
    var titleId: js.UndefOr[String] = js.undefined
  }
  object DialogContextValue {
    
    inline def apply(): DialogContextValue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogContextValue]
    }
    
    extension [Self <: DialogContextValue](x: Self) {
      
      inline def setTitleId(value: String): Self = StObject.set(x, "titleId", value.asInstanceOf[js.Any])
      
      inline def setTitleIdUndefined: Self = StObject.set(x, "titleId", js.undefined)
    }
  }
  
  type _To = Context[DialogContextValue]
  
  /* This means you don't have to write `default`, but can instead just say `dialogDialogContextMod.foo` */
  override def _to: Context[DialogContextValue] = default
}
