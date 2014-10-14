package com.teamReserveOn.reserveonAdapters;

import java.util.List;

import com.teamReseveOn.reserveon.R;

import entities.Table;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
 
 

public class TablesAdapter  extends BaseAdapter {
	
	private Context theContext;
	private List<Table> theList;

	
	public TablesAdapter(Context context, List<Table> list	) {
		this.theContext = context;
		this.theList = list;
	}
	
	@Override
	public int getCount() {
		 
		return theList.size();
	}
	

	@Override
	public Object getItem(int position) {
		 
		return theList.get(position);
	}

	@Override
	public long getItemId(int position) {
	 
		return position;
	}

	@Override
	public View getView(int posicao, View convertView, ViewGroup parent) {
	    
		//Recupera a mesa da posição atual
		Table mesa = theList.get(posicao);
		
		LayoutInflater inflater = (LayoutInflater) theContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View v = inflater.inflate(R.layout.tables_list_cell, null);
		
		TextView titulo = (TextView) v.findViewById(R.id.table_title);
		titulo.setText(mesa.getDescLugar());// TODO Fazer inclução de campo titulo no BD
		
		//Atualiza a imagem
		ImageView img = (ImageView) v.findViewById(R.id.table_status);
		img.setImageResource(mesa.getImage());
		
		return  v;
	}

	 

}
