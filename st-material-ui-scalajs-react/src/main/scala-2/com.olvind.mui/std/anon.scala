package com.olvind.mui.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0` extends StObject {
    
    /* standard es2015.symbol.wellknown */
    @JSName(js.Symbol.replace)
    var replace: js.Function2[
        /* string */ java.lang.String, 
        /* replacer */ js.Function2[/* substring */ java.lang.String, /* repeated */ Any, java.lang.String], 
        java.lang.String
      ] = js.native
  }
  
  @js.native
  trait CopyWithin extends StObject {
    
    /* standard es2015.symbol.wellknown */
    var copyWithin: Boolean = js.native
    
    /* standard es2015.symbol.wellknown */
    var entries: Boolean = js.native
    
    /* standard es2015.symbol.wellknown */
    var fill: Boolean = js.native
    
    /* standard es2015.symbol.wellknown */
    var find: Boolean = js.native
    
    /* standard es2015.symbol.wellknown */
    var findIndex: Boolean = js.native
    
    /* standard es2015.symbol.wellknown */
    var keys: Boolean = js.native
    
    /* standard es2015.symbol.wellknown */
    var values: Boolean = js.native
  }
  object CopyWithin {
    
    @scala.inline
    def apply(
      copyWithin: Boolean,
      entries: Boolean,
      fill: Boolean,
      find: Boolean,
      findIndex: Boolean,
      keys: Boolean,
      values: Boolean
    ): CopyWithin = {
      val __obj = js.Dynamic.literal(copyWithin = copyWithin.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], find = find.asInstanceOf[js.Any], findIndex = findIndex.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[CopyWithin]
    }
    
    @scala.inline
    implicit class CopyWithinMutableBuilder[Self <: CopyWithin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCopyWithin(value: Boolean): Self = StObject.set(x, "copyWithin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntries(value: Boolean): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFind(value: Boolean): Self = StObject.set(x, "find", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFindIndex(value: Boolean): Self = StObject.set(x, "findIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeys(value: Boolean): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: Boolean): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Match extends StObject {
    
    /* standard es2015.symbol.wellknown */
    @JSName(js.Symbol.`match`)
    var `match`: js.Function1[/* string */ java.lang.String, RegExpMatchArray | Null] = js.native
  }
  
  @js.native
  trait Replace extends StObject {
    
    /* standard es2015.symbol.wellknown */
    @JSName(js.Symbol.replace)
    var replace: js.Function2[/* string */ java.lang.String, /* replaceValue */ java.lang.String, java.lang.String] = js.native
  }
  
  @js.native
  trait Search extends StObject {
    
    /* standard es2015.symbol.wellknown */
    @JSName(js.Symbol.search)
    var search: js.Function1[/* string */ java.lang.String, Double] = js.native
  }
  
  @js.native
  trait Split extends StObject {
    
    /* standard es2015.symbol.wellknown */
    @JSName(js.Symbol.split)
    var split: js.Function2[
        /* string */ java.lang.String, 
        /* limit */ js.UndefOr[Double], 
        js.Array[java.lang.String]
      ] = js.native
  }
}
