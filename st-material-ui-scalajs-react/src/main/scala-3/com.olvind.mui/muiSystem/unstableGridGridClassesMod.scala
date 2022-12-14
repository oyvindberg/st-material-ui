package com.olvind.mui.muiSystem

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unstableGridGridClassesMod {
  
  trait GridClasses extends StObject {
    
    /** Styles applied to the root element if `container={true}`. */
    var container: String
    
    /** Styles applied to the root element if `direction="column"`. */
    var `direction-xs-column`: String
    
    /** Styles applied to the root element if `direction="column-reverse"`. */
    var `direction-xs-column-reverse`: String
    
    /** Styles applied to the root element if `direction="row-reverse"`. */
    var `direction-xs-row-reverse`: String
    
    /** Styles applied to the root element. */
    var root: String
    
    /** Styles applied to the root element if `wrap="nowrap"`. */
    var `wrap-xs-nowrap`: String
    
    /** Styles applied to the root element if `wrap="reverse"`. */
    var `wrap-xs-wrap-reverse`: String
  }
  object GridClasses {
    
    inline def apply(
      container: String,
      `direction-xs-column`: String,
      `direction-xs-column-reverse`: String,
      `direction-xs-row-reverse`: String,
      root: String,
      `wrap-xs-nowrap`: String,
      `wrap-xs-wrap-reverse`: String
    ): GridClasses = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.updateDynamic("direction-xs-column")(`direction-xs-column`.asInstanceOf[js.Any])
      __obj.updateDynamic("direction-xs-column-reverse")(`direction-xs-column-reverse`.asInstanceOf[js.Any])
      __obj.updateDynamic("direction-xs-row-reverse")(`direction-xs-row-reverse`.asInstanceOf[js.Any])
      __obj.updateDynamic("wrap-xs-nowrap")(`wrap-xs-nowrap`.asInstanceOf[js.Any])
      __obj.updateDynamic("wrap-xs-wrap-reverse")(`wrap-xs-wrap-reverse`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GridClasses]
    }
    
    extension [Self <: GridClasses](x: Self) {
      
      inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def `setDirection-xs-column`(value: String): Self = StObject.set(x, "direction-xs-column", value.asInstanceOf[js.Any])
      
      inline def `setDirection-xs-column-reverse`(value: String): Self = StObject.set(x, "direction-xs-column-reverse", value.asInstanceOf[js.Any])
      
      inline def `setDirection-xs-row-reverse`(value: String): Self = StObject.set(x, "direction-xs-row-reverse", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def `setWrap-xs-nowrap`(value: String): Self = StObject.set(x, "wrap-xs-nowrap", value.asInstanceOf[js.Any])
      
      inline def `setWrap-xs-wrap-reverse`(value: String): Self = StObject.set(x, "wrap-xs-wrap-reverse", value.asInstanceOf[js.Any])
    }
  }
}
