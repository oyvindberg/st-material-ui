package com.olvind.mui.muiStyledEngine

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styledEngineProviderStyledEngineProviderMod {
  
  @js.native
  trait StyledEngineProviderProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var injectFirst: js.UndefOr[Boolean] = js.native
  }
  object StyledEngineProviderProps {
    
    @scala.inline
    def apply(): StyledEngineProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyledEngineProviderProps]
    }
    
    @scala.inline
    implicit class StyledEngineProviderPropsMutableBuilder[Self <: StyledEngineProviderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setInjectFirst(value: Boolean): Self = StObject.set(x, "injectFirst", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInjectFirstUndefined: Self = StObject.set(x, "injectFirst", js.undefined)
    }
  }
}
