package com.olvind.mui.muiStyledEngine

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styledEngineProviderStyledEngineProviderMod {
  
  trait StyledEngineProviderProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.undefined
    
    var injectFirst: js.UndefOr[Boolean] = js.undefined
  }
  object StyledEngineProviderProps {
    
    inline def apply(): StyledEngineProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyledEngineProviderProps]
    }
    
    extension [Self <: StyledEngineProviderProps](x: Self) {
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setInjectFirst(value: Boolean): Self = StObject.set(x, "injectFirst", value.asInstanceOf[js.Any])
      
      inline def setInjectFirstUndefined: Self = StObject.set(x, "injectFirst", js.undefined)
    }
  }
}
